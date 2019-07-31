package com.playtech.intern.protocol.messages;

public abstract class ResponseBuilder extends MessageBodyBuilder {

	private int statusCode;
    private String statusMessage;
    
    public ResponseBuilder() {}
	
	public ResponseBuilder(Request request) {
		setMessageId(request.getMessageId());
	}
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

}