package com.playtech.intern.protocol.messages.add;

import com.playtech.intern.protocol.messages.RequestBuilder;

public class AddBetRequestBuilder extends RequestBuilder {

    private String betId;
    private String userId;
    private long timeStamp;
    private long amount;
    
	public String getBetId() {
		return betId;
	}
	public void setBetId(String betId) {
		this.betId = betId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	public AddBetRequest build() {
		return new AddBetRequest(getMessageId(), getBetId(), getUserId(), getTimeStamp(), getAmount());
	}

}