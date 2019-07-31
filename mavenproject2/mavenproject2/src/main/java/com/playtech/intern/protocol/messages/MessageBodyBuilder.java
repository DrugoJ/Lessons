package com.playtech.intern.protocol.messages;

public abstract class MessageBodyBuilder {

	private long messageId;

	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	public abstract MessageBody build();
	
}
