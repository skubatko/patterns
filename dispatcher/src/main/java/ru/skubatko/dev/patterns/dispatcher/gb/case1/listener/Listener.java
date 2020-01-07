package ru.skubatko.dev.patterns.dispatcher.gb.case1.listener;

import ru.skubatko.dev.patterns.dispatcher.gb.case1.event.Event;

@FunctionalInterface
public interface Listener<E extends Event> {

    void handle(Event event);

}
