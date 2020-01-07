package ru.skubatko.dev.patterns.dispatcher.gb.case1;

import ru.skubatko.dev.patterns.dispatcher.gb.case1.dispatcher.Dispatcher;
import ru.skubatko.dev.patterns.dispatcher.gb.case1.event.DateEvent;
import ru.skubatko.dev.patterns.dispatcher.gb.case1.event.TextEvent;
import ru.skubatko.dev.patterns.dispatcher.gb.case1.listener.DateListener;
import ru.skubatko.dev.patterns.dispatcher.gb.case1.listener.TestListener;
import ru.skubatko.dev.patterns.dispatcher.gb.case1.listener.TextListener;

/**
 * Dispatcher pattern example
 */
public class App {

    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();

        dispatcher.subscribe(DateEvent.class,new DateListener());
        dispatcher.subscribe(TextEvent.class,new TextListener());
        dispatcher.subscribe(TextEvent.class,new TestListener());

        dispatcher.notifyEventSubscribers(new DateEvent());
        dispatcher.notifyEventSubscribers(new TextEvent("testTextEvent!!"));
    }

}
