package com.playtech.intern.protocol.messages.cancel;

import com.playtech.intern.protocol.messages.Response;

public class CancelBetResponse extends Response {

	protected CancelBetResponse(long messageId, int statusCode, String statusMessage) {
		super(messageId, statusCode, statusMessage);
	}

}