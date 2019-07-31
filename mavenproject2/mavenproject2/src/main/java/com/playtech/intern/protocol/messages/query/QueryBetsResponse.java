package com.playtech.intern.protocol.messages.query;

import java.util.Collection;
import java.util.Collections;

import com.playtech.intern.protocol.messages.Response;

public class QueryBetsResponse extends Response {

    private final Collection<Bet> bets;

    protected QueryBetsResponse(long messageId, int statusCode, String statusMessage, Collection<Bet> bets) {
		super(messageId, statusCode, statusMessage);
		this.bets = bets == null ? Collections.emptySet() : Collections.unmodifiableCollection(bets);
	}

	public Collection<Bet> getBets() {
		return bets;
	}

}
