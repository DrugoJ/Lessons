package com.playtech.intern.protocol.messages.add;

import com.playtech.intern.protocol.messages.ResponseBuilder;

public class AddBetResponseBuilder extends ResponseBuilder {

	public AddBetResponseBuilder() {}
	
	public AddBetResponseBuilder(AddBetRequest request) {
		super(request);
	}
	
	public AddBetResponse build() {
		return new AddBetResponse(getMessageId(), getStatusCode(), getStatusMessage());
	}

}
