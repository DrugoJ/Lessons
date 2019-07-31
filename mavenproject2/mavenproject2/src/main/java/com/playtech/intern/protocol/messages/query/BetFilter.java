package com.playtech.intern.protocol.messages.query;

import com.playtech.intern.protocol.data.BetStatus;

public class BetFilter {
	
    private final String betId;
    private final String userId;
    private final Long minTimeStamp;
    private final Long maxTimeStamp;
    private final Long minAmount;
    private final Long maxAmount;
    private final BetStatus status;

    public BetFilter(String betId, String userId, Long minTimeStamp, Long maxTimeStamp, Long minAmount, Long maxAmount, BetStatus status) {
        this.betId = betId;
        this.userId = userId;
        this.minTimeStamp = minTimeStamp;
        this.maxTimeStamp = maxTimeStamp;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.status = status;
    }

    public String getBetId() {
        return betId;
    }

    public String getUserId() {
        return userId;
    }

    public Long getMinTimeStamp() {
        return minTimeStamp;
    }

    public Long getMaxTimeStamp() {
        return maxTimeStamp;
    }

    public Long getMinAmount() {
        return minAmount;
    }

    public Long getMaxAmount() {
        return maxAmount;
    }

    public BetStatus getStatus() {
        return status;
    }

}