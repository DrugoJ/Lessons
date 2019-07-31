package com.playtech.intern.protocol.messages;

public abstract class Response extends MessageBody {

	private final int statusCode;
    private final String statusMessage;

	protected Response(long messageId, int statusCode, String statusMessage) {
		super(messageId);
		if (statusCode == 0) {
			throw new IllegalArgumentException("statusCode cannot be 0");
		}
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
	}
	
	public void validate() {
		super.validate();
    	if (statusCode == 0) {
			throw new IllegalStateException("statusCode has to be set");
		}
	}

    public int getStatusCode() {
        return statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

}