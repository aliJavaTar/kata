package com.pattern.factory.publish;

public class InstagramPublisherFactory extends MessagePublisher {
    @Override
    protected Publisher createPublisher(Message message) {
        return new InstegramPublisher();
    }
}
