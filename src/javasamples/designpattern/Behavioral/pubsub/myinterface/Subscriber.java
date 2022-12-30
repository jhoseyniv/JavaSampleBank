package javasamples.designpattern.Behavioral.pubsub.myinterface;

import javasamples.designpattern.Behavioral.pubsub.Message;

public interface Subscriber {
    public void observeBus(Message message);


}
