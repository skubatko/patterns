package ru.skubatko.dev.patterns.dispatcher.gb.case2.event;

public interface Event<T> {

    T getContent();
}
