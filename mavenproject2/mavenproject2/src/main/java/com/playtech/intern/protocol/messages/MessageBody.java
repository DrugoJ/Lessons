package com.playtech.intern.protocol.messages;

public abstract class MessageBody {

	private final long messageId;

	protected MessageBody(long messageId) {
		this.messageId = messageId;
	}

	public long getMessageId() {
		return messageId;
	}
	
	public void validate() {
    	if (messageId == 0) {
			throw new IllegalStateException("messageId has to be set");
		}
	}
}
