package com.playtech.intern.protocol.messages.query;

import com.playtech.intern.protocol.messages.Request;

public class QueryBetsRequest extends Request {
    
	private final BetFilter filter;

    protected QueryBetsRequest(long messageId, BetFilter filter) {
		super(messageId);
		this.filter = filter;
	}
    
    public void validate() {
    	super.validate();
    	if (filter == null) {
			throw new RuntimeException("filter cannot be null");
		}
    }

    public BetFilter getFilter() {
        return filter;
    }

}