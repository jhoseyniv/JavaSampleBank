package javasamples.designpattern.Behavioral.pubsub;

import javasamples.designpattern.Behavioral.pubsub.myinterface.MessageBus;
import javasamples.designpattern.Behavioral.pubsub.myinterface.Publisher;
import javasamples.designpattern.Behavioral.pubsub.myinterface.Subscriber;

import java.util.*;
import java.util.stream.Collectors;

public class MessageBusImpl implements MessageBus {

    // Set<Subscriber> subscribers = new HashSet<Subscriber>();
    Map<String , Set<Subscriber>>  subscribersByTopicGroupBy = new HashMap<String , Set<Subscriber>>();
    Queue<Message> messageQueue = new LinkedList<Message>();

    @Override
    public void addMessageToQueue(Message message) {
        messageQueue.add(message);
    }

    @Override
    public void registerSubscriberToBusByTopic(String topic, Subscriber subscriber) {
        Set<Subscriber> subscribers;
        if (subscribersByTopicGroupBy.containsKey(topic)){
            subscribers = subscribersByTopicGroupBy.get(topic);
        }else {
            subscribers = new HashSet<Subscriber>();
        }
        subscribers.add(subscriber);
        subscribersByTopicGroupBy.put(topic,subscribers);
    }

    @Override
    public void unRegisterSubscriberFromBusByTopic(String topic, Subscriber subscriber) {
        Set<Subscriber> subscribers;
        if(subscribersByTopicGroupBy.containsKey(topic)){
            subscribers =subscribersByTopicGroupBy.get(topic);
            if(subscribers.contains(subscriber))
                subscribers.remove(subscriber);
                subscribersByTopicGroupBy.put(topic,subscribers);
        }
    }

    @Override
    public Map<String,List<Message>> getMessageByTopic(String topic) {
        Map<String,List<Message>> groupedMessages = new HashMap<>();
        groupedMessages = messageQueue.stream().collect(Collectors.groupingBy(Message::getTopic,Collectors.toList()));
        return groupedMessages;
    }

    @Override
    public void sendMessageToSubscriberByTopic(String topic) {

    }

    @Override
    public void registerPublisherToBus(Publisher publisher) {

    }

    @Override
    public void removePublisherFromBus(Publisher publisher) {

    }


}
