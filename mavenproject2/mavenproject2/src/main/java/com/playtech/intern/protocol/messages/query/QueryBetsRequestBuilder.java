package com.playtech.intern.protocol.messages.query;

import com.playtech.intern.protocol.messages.RequestBuilder;

public class QueryBetsRequestBuilder extends RequestBuilder {
    
	private BetFilter filter;

	public BetFilter getFilter() {
		return filter;
	}

	public void setFilter(BetFilter filter) {
		this.filter = filter;
	}

	public QueryBetsRequest build() {
		return new QueryBetsRequest(getMessageId(), getFilter());
	}

}