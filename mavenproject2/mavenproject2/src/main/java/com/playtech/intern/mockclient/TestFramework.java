package com.playtech.intern.mockclient;

import java.io.File;
import java.net.URI;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.log4j.Logger;

import com.playtech.intern.server.connection.ResponsibleGamingServer;

public class TestFramework {

    public final static int SERVER_SOCKET_PORT = 1337;
    private final static Logger LOGGER = Logger.getLogger(TestFramework.class);
    private AtomicInteger successfulThreads;
    private CountDownLatch latch;
    private CyclicBarrier gate;

    AtomicInteger getSuccessfulThreads() {
        return successfulThreads;
    }

    CountDownLatch getLatch() {
        return latch;
    }

    CyclicBarrier getGate() {
        return gate;
    }

    private void runTests() {
        ResponsibleGamingServer responsibleGamingServer = null;
        Integer testcaseThreads = null;
        try {
            LOGGER.info("Collecting test cases");
            File testcasesDir = new File(new URI(getClass().getClassLoader().getResource("testcases").getFile()).getPath());
            File[] testcaseFiles = testcasesDir.listFiles();
            testcaseThreads = testcaseFiles.length;

            successfulThreads = new AtomicInteger(0);
            latch = new CountDownLatch(testcaseThreads);
            gate = new CyclicBarrier(testcaseThreads + 1);

            LOGGER.info("Starting server");
            responsibleGamingServer = new ResponsibleGamingServer(SERVER_SOCKET_PORT);
            responsibleGamingServer.start();

            LOGGER.info("Creating MockClient threads");
            for (File testcaseFile : testcaseFiles) {
                new Thread(new MockClient(this, testcaseFile)).start();
            }

            LOGGER.info("Raising the gate on MockClient threads - they will all start almost simultaneously!");
            try {
                gate.await();
            } catch (Exception e) {
                throw new RuntimeException("CyclicBarrier wait exception", e);
            }

            LOGGER.info("Waiting until all MockClient threads have completed");
            try {
                latch.await();
            } catch (Exception e) {
                throw new RuntimeException("CountDownLatch wait exception", e);
            }

            LOGGER.info("All MockClient threads completed, closing down.");
        } catch (Exception e) {
        	 /* ignore */
		}
        finally {
            if (responsibleGamingServer != null) {
                responsibleGamingServer.close();
            }

            if (testcaseThreads == null) {
                LOGGER.fatal("Test FAILURE! Did not manage to launch any of the test threads!");
            }
            else if (successfulThreads.get() == testcaseThreads) {
                LOGGER.info("Test SUCCESS! All " + successfulThreads.get() + "/" + testcaseThreads + " test threads completed successfully.");
            }
            else {
                LOGGER.fatal("Test FAILURE! Only " + successfulThreads.get() + "/" + testcaseThreads + " test threads completed successfully.");
            }
        }
    }

    public static void main(String[] args) {
        new TestFramework().runTests();
    }

}