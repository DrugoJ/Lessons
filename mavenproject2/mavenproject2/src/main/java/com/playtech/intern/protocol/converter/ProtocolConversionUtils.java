package com.playtech.intern.protocol.converter;

import java.util.Objects;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;
import com.playtech.intern.protocol.messages.MessageBody;
import com.playtech.intern.protocol.messages.MessageBodyBuilder;
import com.playtech.intern.protocol.messages.MessageEnvelope;

public class ProtocolConversionUtils {

    private static final Gson gsonEngine = new Gson();

    private ProtocolConversionUtils() {}

    public static <T extends MessageBody> String marshall(T payload) {
        MessageEnvelope<T> command = MessageEnvelope.create(payload.getClass().getName(), payload);
        String asString = gsonEngine.toJson(command);
        return asString;
    }

    @SuppressWarnings("unchecked")
	public static <T extends MessageBody> T unmarshall(String rawJson) throws Exception {
        LinkedTreeMap<?,?> asMap = gsonEngine.fromJson(rawJson, LinkedTreeMap.class);
        String clazzName = Objects.toString(asMap.get("type"))+"Builder";
        if (!clazzName.startsWith("com.playtech.intern.protocol.messages.")) {
            throw new RuntimeException("Unknown/malicious class: " + clazzName);
        }
		Class<? extends MessageBodyBuilder> clazz = (Class<? extends MessageBodyBuilder>) Class.forName(clazzName);
        JsonObject jsonObject = gsonEngine.toJsonTree(asMap.get("data")).getAsJsonObject();
        return (T) gsonEngine.fromJson(jsonObject, clazz).build();
    }

}