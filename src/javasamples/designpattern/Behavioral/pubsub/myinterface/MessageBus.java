package javasamples.designpattern.Behavioral.pubsub.myinterface;

import javasamples.designpattern.Behavioral.pubsub.Message;

import java.util.List;
import java.util.Map;

public interface MessageBus {
    public void addMessageToQueue(Message message);
    public void registerSubscriberToBusByTopic(String topic, Subscriber subscriber);
    public void unRegisterSubscriberFromBusByTopic(String topic, Subscriber subscriber);
    public Map<String, List<Message>> getMessageByTopic(String topic);
    public void sendMessageToSubscriberByTopic(String topic);

    public void registerPublisherToBus(Publisher publisher);
    public void removePublisherFromBus(Publisher publisher);


}
