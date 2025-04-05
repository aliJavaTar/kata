package com.pattern.factory.publish;

public class LinkedInPublisherFactory extends MessagePublisher {
    @Override
    protected Publisher createPublisher(Message message) {
        return new linkedInPublisher();
    }
}
