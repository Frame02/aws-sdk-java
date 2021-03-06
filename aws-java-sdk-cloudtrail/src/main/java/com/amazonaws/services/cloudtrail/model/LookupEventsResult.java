/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;

/**
 * <p>
 * Contains a response to a LookupEvents action.
 * </p>
 */
public class LookupEventsResult implements Serializable, Cloneable {

    /**
     * A list of events returned based on the lookup attributes specified and
     * the CloudTrail event. The events list is sorted by time. The most
     * recent event is listed first.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Event> events;

    /**
     * The token to use to get the next page of results after a previous API
     * call. If the token does not appear, there are no more results to
     * return. The token must be passed in with the same parameters as the
     * previous call. For example, if the original call specified an
     * AttributeKey of 'Username' with a value of 'root', the call with
     * NextToken should include those same parameters.
     */
    private String nextToken;

    /**
     * A list of events returned based on the lookup attributes specified and
     * the CloudTrail event. The events list is sorted by time. The most
     * recent event is listed first.
     *
     * @return A list of events returned based on the lookup attributes specified and
     *         the CloudTrail event. The events list is sorted by time. The most
     *         recent event is listed first.
     */
    public java.util.List<Event> getEvents() {
        if (events == null) {
              events = new com.amazonaws.internal.ListWithAutoConstructFlag<Event>();
              events.setAutoConstruct(true);
        }
        return events;
    }
    
    /**
     * A list of events returned based on the lookup attributes specified and
     * the CloudTrail event. The events list is sorted by time. The most
     * recent event is listed first.
     *
     * @param events A list of events returned based on the lookup attributes specified and
     *         the CloudTrail event. The events list is sorted by time. The most
     *         recent event is listed first.
     */
    public void setEvents(java.util.Collection<Event> events) {
        if (events == null) {
            this.events = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Event> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Event>(events.size());
        eventsCopy.addAll(events);
        this.events = eventsCopy;
    }
    
    /**
     * A list of events returned based on the lookup attributes specified and
     * the CloudTrail event. The events list is sorted by time. The most
     * recent event is listed first.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events A list of events returned based on the lookup attributes specified and
     *         the CloudTrail event. The events list is sorted by time. The most
     *         recent event is listed first.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupEventsResult withEvents(Event... events) {
        if (getEvents() == null) setEvents(new java.util.ArrayList<Event>(events.length));
        for (Event value : events) {
            getEvents().add(value);
        }
        return this;
    }
    
    /**
     * A list of events returned based on the lookup attributes specified and
     * the CloudTrail event. The events list is sorted by time. The most
     * recent event is listed first.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events A list of events returned based on the lookup attributes specified and
     *         the CloudTrail event. The events list is sorted by time. The most
     *         recent event is listed first.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupEventsResult withEvents(java.util.Collection<Event> events) {
        if (events == null) {
            this.events = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Event> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Event>(events.size());
            eventsCopy.addAll(events);
            this.events = eventsCopy;
        }

        return this;
    }

    /**
     * The token to use to get the next page of results after a previous API
     * call. If the token does not appear, there are no more results to
     * return. The token must be passed in with the same parameters as the
     * previous call. For example, if the original call specified an
     * AttributeKey of 'Username' with a value of 'root', the call with
     * NextToken should include those same parameters.
     *
     * @return The token to use to get the next page of results after a previous API
     *         call. If the token does not appear, there are no more results to
     *         return. The token must be passed in with the same parameters as the
     *         previous call. For example, if the original call specified an
     *         AttributeKey of 'Username' with a value of 'root', the call with
     *         NextToken should include those same parameters.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use to get the next page of results after a previous API
     * call. If the token does not appear, there are no more results to
     * return. The token must be passed in with the same parameters as the
     * previous call. For example, if the original call specified an
     * AttributeKey of 'Username' with a value of 'root', the call with
     * NextToken should include those same parameters.
     *
     * @param nextToken The token to use to get the next page of results after a previous API
     *         call. If the token does not appear, there are no more results to
     *         return. The token must be passed in with the same parameters as the
     *         previous call. For example, if the original call specified an
     *         AttributeKey of 'Username' with a value of 'root', the call with
     *         NextToken should include those same parameters.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use to get the next page of results after a previous API
     * call. If the token does not appear, there are no more results to
     * return. The token must be passed in with the same parameters as the
     * previous call. For example, if the original call specified an
     * AttributeKey of 'Username' with a value of 'root', the call with
     * NextToken should include those same parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to use to get the next page of results after a previous API
     *         call. If the token does not appear, there are no more results to
     *         return. The token must be passed in with the same parameters as the
     *         previous call. For example, if the original call specified an
     *         AttributeKey of 'Username' with a value of 'root', the call with
     *         NextToken should include those same parameters.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupEventsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEvents() != null) sb.append("Events: " + getEvents() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LookupEventsResult == false) return false;
        LookupEventsResult other = (LookupEventsResult)obj;
        
        if (other.getEvents() == null ^ this.getEvents() == null) return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public LookupEventsResult clone() {
        try {
            return (LookupEventsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    