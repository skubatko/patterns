package ru.skubatko.dev.patterns.mediator.gb.mediator;

import ru.skubatko.dev.patterns.mediator.gb.dispatcher.Dispatcher;
import ru.skubatko.dev.patterns.mediator.gb.event.CarEvent;
import ru.skubatko.dev.patterns.mediator.gb.listener.Listener;

public class AbstractMediator {

    private Dispatcher dispatcher;

    public AbstractMediator(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public <T extends CarEvent> void registryAsync(
            Class<T> eventSource,
            Class<? extends CarEvent> eventTarget
    ) {
        dispatcher.subscribe(eventSource, carEvent -> {
            CarEvent target = null;
            try {
                target = eventTarget.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
            target.setCar(carEvent.getCar());
            dispatcher.notifyEventSubscribersAsync(target);
        });

    }

    public <E> void subscribe(Class<E> eventClass, Listener<E> listener) {
        dispatcher.subscribe(eventClass, listener);
    }

    public <E> void unsubscribe(Class<E> eventClass, Listener<E> listener) {
        dispatcher.unsubscribe(eventClass, listener);
    }

}
