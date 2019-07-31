package com.playtech.intern.protocol.messages.cancel;

import com.playtech.intern.protocol.messages.Request;

public class CancelBetRequest extends Request {
	
	private final String betId;

    protected CancelBetRequest(long messageId, String betId) {
		super(messageId);
		this.betId = betId;
	}

    public String getBetId() {
		return betId;
	}

}
