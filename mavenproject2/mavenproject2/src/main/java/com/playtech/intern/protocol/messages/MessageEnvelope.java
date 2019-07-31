package com.playtech.intern.protocol.messages;

public class MessageEnvelope<T extends MessageBody> {

	private String type;
    private T data;

    private MessageEnvelope() {
    }

    public String getType() {
        return type;
    }

    public T getData() {
        return data;
    }

    public static<T extends MessageBody> MessageEnvelope<T> create(String type, T data) {
        MessageEnvelope<T> command = new MessageEnvelope<T>();
        command.type = type;
        command.data = data;
        return command;
    }
    
}
