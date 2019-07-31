package com.playtech.intern.protocol.messages.cancel;

import com.playtech.intern.protocol.messages.ResponseBuilder;

public class CancelBetResponseBuilder extends ResponseBuilder {

	public CancelBetResponseBuilder() {}
	
	public CancelBetResponseBuilder(CancelBetRequest request) {
		super(request);
	}
	
	public CancelBetResponse build() {
		return new CancelBetResponse(getMessageId(), getStatusCode(), getStatusMessage());
	}

}