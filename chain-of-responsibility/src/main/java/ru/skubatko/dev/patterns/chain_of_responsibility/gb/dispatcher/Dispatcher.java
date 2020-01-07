package ru.skubatko.dev.patterns.chain_of_responsibility.gb.dispatcher;

import ru.skubatko.dev.patterns.chain_of_responsibility.gb.event.CarEvent;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.listener.Listener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Dispatcher {

    private static Dispatcher instance;

    private Map<Class<? extends CarEvent>, List<Listener>> subscribers = new HashMap<>();
    private ExecutorService executorService = Executors.newCachedThreadPool();

    private Dispatcher() {
    }

    public static Dispatcher getInstance() {
        if (instance == null) {
            instance = new Dispatcher();
        }
        return instance;
    }

    public <E extends CarEvent> void subscribe(Class<E> eventClass, Listener eventSubscriber) {
        if (eventClass == null || eventSubscriber == null) {
            return;
        }
        getSubscribers(eventClass).add(eventSubscriber);
    }

    public <E extends CarEvent> void unsubscribe(Class<E> eventClass, Listener eventSubscriber) {
        if (eventClass == null || eventSubscriber == null) {
            return;
        }
        getSubscribers(eventClass).remove(eventSubscriber);
    }

    public synchronized void notifyEventSubscribers(CarEvent event) {
        if (event == null) {
            return;
        }
        List<Listener> eventSubscribers = subscribers.get(event.getClass());
        if (eventSubscribers == null) {
            return;
        }
        for (Listener eventSubscriber : eventSubscribers) {
            eventSubscriber.handle(event);
        }
    }

    public synchronized void notifyEventSubscribersAsync(CarEvent event) {
        if (event == null) {
            return;
        }
        List<Listener> eventSubscribers = subscribers.get(event.getClass());
        if (eventSubscribers == null) {
            return;
        }
        for (Listener eventSubscriber : eventSubscribers) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    eventSubscriber.handle(event);
                }
            });
        }
    }

    public void shutdown() {
        try {
            executorService.awaitTermination(2L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }

    private List<Listener> getSubscribers(Class<? extends CarEvent> eventClass) {
        if (eventClass == null) {
            return Collections.emptyList();
        }
        return subscribers.computeIfAbsent(eventClass, s -> new ArrayList<>());
    }


}
