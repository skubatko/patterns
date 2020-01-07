package ru.skubatko.dev.patterns.mediator.gb.listener;

@FunctionalInterface
public interface Listener<E> {

    void handle(E event);
}
