package com.playtech.intern.protocol.messages.add;

import com.playtech.intern.protocol.messages.Response;

public class AddBetResponse extends Response {

    protected AddBetResponse(long messageId, int statusCode, String statusMessage) {
		super(messageId, statusCode, statusMessage);
	}

}
