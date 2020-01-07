package ru.skubatko.dev.patterns.dispatcher.gb.case1.dispatcher;


import ru.skubatko.dev.patterns.dispatcher.gb.case1.event.Event;
import ru.skubatko.dev.patterns.dispatcher.gb.case1.listener.Listener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Dispatcher {

    private Map<Class<? extends Event>, List<Listener<? extends Event>>> subscribers = new HashMap<>();

    public <E extends Event> void subscribe(Class<E> eventClass, Listener<E> eventSubscriber) {
        if (eventClass == null || eventSubscriber == null) {
            return;
        }
        getSubscribers(eventClass).add(eventSubscriber);
    }

    public <E extends Event> void unsubscribe(Class<E> eventClass, Listener<E> eventSubscriber) {
        if (eventClass == null || eventSubscriber == null) {
            return;
        }
        getSubscribers(eventClass).remove(eventSubscriber);
    }

    public void notifyEventSubscribers(Event event) {
        if (event == null) {
            return;
        }
        List<Listener<? extends Event>> eventSubscribers = subscribers.get(event.getClass());
        if (eventSubscribers == null) {
            return;
        }
        for (Listener<? extends Event> eventSubscriber : eventSubscribers) {
            eventSubscriber.handle(event);
        }
    }

    private List<Listener<? extends Event>> getSubscribers(Class<? extends Event> eventClass) {
        if (eventClass == null) {
            return Collections.emptyList();
        }
        return subscribers.computeIfAbsent(eventClass, s -> new ArrayList<>());
    }

}
