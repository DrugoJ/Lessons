package com.playtech.intern.mockclient;

import com.playtech.intern.protocol.messages.Request;
import com.playtech.intern.protocol.messages.Response;
import com.playtech.intern.protocol.converter.ProtocolConversionUtils;
import org.apache.log4j.Logger;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class MockClient implements Runnable {

    private final static Logger LOGGER = Logger.getLogger(MockClient.class);

    private final TestFramework parentFramework;
    private final File testcaseFile;

    public MockClient(TestFramework parentFramework, File testcaseFile) {
        this.parentFramework = parentFramework;
        this.testcaseFile = testcaseFile;
    }

    private void verifyRequestResponse(Request request, String expectedResponseString, OutputStream outputStream, BufferedReader inputReader) {
        String actualResponseString;
        try {
            actualResponseString = ProtocolConversionUtils.marshall(sendRequest(request, outputStream, inputReader));
        } catch (Exception e) {
            LOGGER.error(this + ": Unable to send request and parse response", e);
            throw new RuntimeException(e);
        }
        if (!actualResponseString.equals(expectedResponseString)) {
            throw new RuntimeException(this + ": Expected and actual response do not match. Expected: [" + expectedResponseString + "], actual: [ " + actualResponseString + "]");
        }
    }

    private Response sendRequest(Request request, OutputStream outputStream, BufferedReader input) throws Exception {
        String command = ProtocolConversionUtils.marshall(request) + "\n";

        outputStream.write(command.getBytes(StandardCharsets.UTF_8));
        outputStream.flush();

        String inputStr = input.readLine();

        LOGGER.info(this + ": Message received: " + inputStr);
        return ProtocolConversionUtils.unmarshall(inputStr);
    }

    private List<RequestResponsePair> getExpectedMessagePairs() {
        try {
            List<String> contents = Files.readAllLines(testcaseFile.toPath(), StandardCharsets.UTF_8);
            List<RequestResponsePair> pairList = new ArrayList<>();

            for (int i = 0; i < contents.size() - 1; i++) {
                String line = contents.get(i).trim();
                if (!line.isEmpty() && !line.startsWith("#")) {
                    pairList.add(new RequestResponsePair(contents.get(i), contents.get(++i)));
                }
            }

            return pairList;
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        try {
            parentFramework.getGate().await();
        }
        catch (Exception e) {
            LOGGER.error(this + ": Exception when waiting for gate to release", e);
            throw new RuntimeException(e);
        }

        try (Socket socket = new Socket("localhost", TestFramework.SERVER_SOCKET_PORT);
             OutputStream outputStream = socket.getOutputStream();
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8))) {
            for (RequestResponsePair pair : getExpectedMessagePairs()) {
                Request request;
                try {
                    request = ProtocolConversionUtils.unmarshall(pair.getRequestString());
                }
                catch (Exception e) {
                    LOGGER.error("Unable to marshall request and/or response strings to corresponding objects", e);
                    throw new RuntimeException(e);
                }

                verifyRequestResponse(request, pair.getResponseString(), outputStream, input);
            }
            LOGGER.info(this + ": All test cases passed successfully!");
            parentFramework.getSuccessfulThreads().incrementAndGet();
        } catch (IOException e) {
            LOGGER.error(this + ": Unable to use socket", e);
            throw new RuntimeException(e);
        } finally {
            parentFramework.getLatch().countDown();
        }
    }

    @Override
    public String toString() {
        return "MockClient [" + testcaseFile.getName() + "]";
    }

    public static class RequestResponsePair {
        private final String requestString;
        private final String responseString;

        public RequestResponsePair(String requestString, String responseString) {
            this.requestString = requestString;
            this.responseString = responseString;
        }

        public String getRequestString() {
            return requestString;
        }

        public String getResponseString() {
            return responseString;
        }
    }

}