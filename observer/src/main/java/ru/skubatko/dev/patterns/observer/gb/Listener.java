package ru.skubatko.dev.patterns.observer.gb;

@FunctionalInterface
public interface Listener {

    void handle(Event event);

}
