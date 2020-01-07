package ru.skubatko.dev.patterns.dispatcher.gb.case1.event;

public interface Event<T> {

    T getContent();
}
