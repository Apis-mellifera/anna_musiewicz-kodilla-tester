package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherAlertService {
    private HashMap<Localization, Set<Subscriber>> subscriptionMap = new HashMap<>();

    public void addSubscriberToLocalization(Localization localization, Subscriber subscriber) {
        Set<Subscriber> subscriberSet = subscriptionMap.getOrDefault(localization, new HashSet<>());
        subscriberSet.add(subscriber);
        subscriptionMap.put(localization, subscriberSet);
    }

    public void sendAlertToAllSubscriber(Alert alert) {
        this.subscriptionMap.forEach((localization, subscriberSet) -> subscriberSet
                .forEach(subscriber -> subscriber.receive(alert)));
    }

    public void sendAlertToSubscribersInGivenLocalization(Localization localization, Alert alert) {
        this.subscriptionMap.forEach((l, subscriberSet) -> {
            if (l == localization) {
                subscriberSet.forEach(subscriber -> subscriber.receive(alert));
            }
        });
    }

    public void removeSubscriber(Subscriber subscriber) {
        for(HashMap.Entry<Localization, Set<Subscriber>> result : subscriptionMap.entrySet()) {
            result.getValue().remove(subscriber);
        }
    }

    public void removeSubscriberFromLocalization(Subscriber subscriber, Localization localization) {
        Set<Subscriber> subscriberSet = subscriptionMap.getOrDefault(localization, new HashSet<>());
        subscriberSet.remove(subscriber);
        subscriptionMap.put(localization, subscriberSet);
    }

    public void cancelLocalization(Localization localization) {
        this.subscriptionMap.remove(localization);
    }
}
