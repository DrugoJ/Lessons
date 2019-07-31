package com.playtech.intern.protocol.messages;

public abstract class Request extends MessageBody {

	protected Request(long messageId) {
		super(messageId);
	}

}