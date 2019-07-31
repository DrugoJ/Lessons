package com.playtech.intern.protocol.messages.cancel;

import com.playtech.intern.protocol.messages.RequestBuilder;

public class CancelBetRequestBuilder extends RequestBuilder {
	
	private String betId;

	public String getBetId() {
		return betId;
	}

	public void setBetId(String betId) {
		this.betId = betId;
	}

	public CancelBetRequest build() {
		return new CancelBetRequest(getMessageId(), getBetId());
	}

}
