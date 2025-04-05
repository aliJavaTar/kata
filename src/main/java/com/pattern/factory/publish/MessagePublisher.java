package com.pattern.factory.publish;

public abstract class MessagePublisher {

    protected abstract Publisher createPublisher(Message message);

    public void publish(Message message) {
        Publisher publisher = this.createPublisher(message);
        publisher.publish(message);
    }

}
