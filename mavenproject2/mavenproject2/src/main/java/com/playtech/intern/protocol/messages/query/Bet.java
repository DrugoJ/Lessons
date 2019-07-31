package com.playtech.intern.protocol.messages.query;

import com.playtech.intern.protocol.data.BetStatus;

public class Bet {

    private final String betId;
    private final String userId;
    private final long timeStamp;
    private final long amount;
    private final BetStatus status;

    public Bet(String betId, String userId, long timeStamp, long amount, BetStatus status) {
        this.betId = betId;
        this.userId = userId;
        this.timeStamp = timeStamp;
        this.amount = amount;
        this.status = status;
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

    public BetStatus getStatus() {
        return status;
    }
}