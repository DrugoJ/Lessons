package com.playtech.intern.protocol.messages.query;

import java.util.Collection;

import com.playtech.intern.protocol.messages.ResponseBuilder;

public class QueryBetsResponseBuilder extends ResponseBuilder {
	
    private Collection<Bet> bets;

    public QueryBetsResponseBuilder() {}
	
	public QueryBetsResponseBuilder(QueryBetsRequest request) {
		super(request);
	}
	
	public Collection<Bet> getBets() {
		return bets;
	}

	public void setBets(Collection<Bet> bets) {
		this.bets = bets;
	}

	public QueryBetsResponse build() {
		return new QueryBetsResponse(getMessageId(), getStatusCode(), getStatusMessage(), getBets());  
	}

}
