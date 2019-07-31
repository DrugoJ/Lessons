package com.playtech.intern.protocol.messages.add;

import com.playtech.intern.protocol.messages.Request;

public class AddBetRequest extends Request {

    private final String betId;
    private final String userId;
    private final long timeStamp;
    private final long amount;

    public AddBetRequest(long messageId, String betId, String userId, long timeStamp, long amount) {
		super(messageId);
		this.betId = betId;
		this.userId = userId;
		this.timeStamp = timeStamp;
		this.amount = amount;
	}

	public String getBetId() {
		return betId;
	}

	public String getUserId() {
		return userId;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public long getAmount() {
		return amount;
	}

}