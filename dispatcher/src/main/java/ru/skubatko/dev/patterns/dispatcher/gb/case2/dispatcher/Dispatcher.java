package ru.skubatko.dev.patterns.dispatcher.gb.case2.dispatcher;

import ru.skubatko.dev.patterns.dispatcher.gb.case2.event.Event;
import ru.skubatko.dev.patterns.dispatcher.gb.case2.listener.Listener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class Dispatcher {

    private Map<Class<? extends Event>, List<Listener<? extends Event>>> subscribers = new HashMap<>();
    private ExecutorService executorService = Executors.newCachedThreadPool();

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

    public synchronized void notifyEventSubscribers(Event event) {
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

    public synchronized void notifyEventSubscribersAsync(Event event) {
        if (event == null) {
            return;
        }
        List<Listener<? extends Event>> eventSubscribers = subscribers.get(event.getClass());
        if (eventSubscribers == null) {
            return;
        }
        for (Listener<? extends Event> eventSubscriber : eventSubscribers) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    eventSubscriber.handle(event);
                }
            });
        }
    }

    public void shutdown(){
        executorService.shutdown();
    }

    private List<Listener<? extends Event>> getSubscribers(Class<? extends Event> eventClass) {
        if (eventClass == null) {
            return Collections.emptyList();
        }
        return subscribers.computeIfAbsent(eventClass, s -> new ArrayList<>());
    }

}
