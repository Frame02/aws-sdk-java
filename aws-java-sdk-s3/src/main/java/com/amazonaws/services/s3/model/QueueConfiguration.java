/*
 * Copyright 2014-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

import java.util.EnumSet;

/**
 * Represents the queue configuration for an Amazon S3 bucket.
 *
 */
public class QueueConfiguration extends NotificationConfiguration {

    /**
     * The Amazon SQS queue ARN for this configuration.
     */
    private final String queueARN;

    /**
     * Creates a new queue configuration with the given queue arn and set of
     * events.
     *
     * @param queueARN
     *            the Amazon SQS queue arn to which the notifications are to be
     *            sent.
     * @param events
     *            the events for which the notifications are to be sent
     */
    public QueueConfiguration(String queueARN, EnumSet<S3Event> events) {
        super(events);
        this.queueARN = queueARN;
    }

    /**
     * Creates a new queue configuration with the given queue arn and set of
     * events.
     *
     * @param queueARN
     *            the Amazon SQS queue arn to which the notifications are to be
     *            sent.
     * @param events
     *            the events for which the notifications are to be sent
     */
    public QueueConfiguration(String queueARN, String... events) {
        super(events);
        this.queueARN = queueARN;
    }

    /**
     * Returns the queue arn for this notification configuration.
     */
    public String getQueueARN() {
        return queueARN;
    }
}
