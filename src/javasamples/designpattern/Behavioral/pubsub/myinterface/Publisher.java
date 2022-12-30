package javasamples.designpattern.Behavioral.pubsub.myinterface;

import javasamples.designpattern.Behavioral.pubsub.Message;

public interface Publisher {
    public void publish(Message message , MessageBus messageBus);
}
