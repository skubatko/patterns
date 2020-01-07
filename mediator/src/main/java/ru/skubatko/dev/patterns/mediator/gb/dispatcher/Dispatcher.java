package ru.skubatko.dev.patterns.mediator.gb.dispatcher;

import ru.skubatko.dev.patterns.mediator.gb.event.CarEvent;
import ru.skubatko.dev.patterns.mediator.gb.listener.Listener;

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

    private Map<Class<? extends CarEvent>, List<Listener<? extends CarEvent>>> subscribers = new HashMap<>();
    private ExecutorService executorService = Executors.newCachedThreadPool();

    private Dispatcher() {
    }

    public static Dispatcher getInstance() {
        if (instance == null) {
            instance = new Dispatcher();
        }
        return instance;
    }

    public <E> void subscribe(Class<E> eventClass, Listener<E> eventSubscriber) {
        if (eventClass == null || eventSubscriber == null) {
            return;
        }
        getSubscribers(eventClass).add(eventSubscriber);
    }

    public <E> void unsubscribe(Class<E> eventClass, Listener<E> eventSubscriber) {
        if (eventClass == null || eventSubscriber == null) {
            return;
        }
        getSubscribers(eventClass).remove(eventSubscriber);
    }

    public synchronized <E> void notifyEventSubscribers(E carEvent) {
        if (carEvent == null) {
            return;
        }
        List<Listener<? extends CarEvent>> eventSubscribers = subscribers.get(carEvent.getClass());
        if (eventSubscribers == null) {
            return;
        }
        for (Listener eventSubscriber : eventSubscribers) {
            eventSubscriber.handle(carEvent);
        }
    }

    public synchronized void notifyEventSubscribersAsync(CarEvent event) {
        if (event == null) {
            return;
        }
        List<Listener<? extends CarEvent>> eventSubscribers = subscribers.get(event.getClass());
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
            executorService.awaitTermination(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }

    private List getSubscribers(Class eventClass) {
        if (eventClass == null) {
            return Collections.emptyList();
        }
        return subscribers.computeIfAbsent(eventClass, s -> new ArrayList<>());
    }


}
