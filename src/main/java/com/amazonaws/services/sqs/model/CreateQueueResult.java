/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sqs.model;

/**
 * <p>
 * 
 * </p>
 */
public class CreateQueueResult {
        
    /**
     * The queue URL for the created queue.
     */
    private String queueUrl;

    /**
     * The queue URL for the created queue.
     *
     * @return The queue URL for the created queue.
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * The queue URL for the created queue.
     *
     * @param queueUrl The queue URL for the created queue.
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * The queue URL for the created queue.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl The queue URL for the created queue.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateQueueResult withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    
}
    