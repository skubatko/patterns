package ru.skubatko.dev.patterns.observer.gb;

import java.util.ArrayList;
import java.util.List;

public final class Observer {

    private List<Listener> subscribers = new ArrayList<>();

    public void subscribe(Listener subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Listener subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(Event event) {
        for (Listener subscriber : subscribers) {
            subscriber.handle(event);
        }
    }

}
