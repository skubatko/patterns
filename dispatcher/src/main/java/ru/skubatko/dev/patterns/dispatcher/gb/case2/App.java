package ru.skubatko.dev.patterns.dispatcher.gb.case2;

import ru.skubatko.dev.patterns.dispatcher.gb.case2.dispatcher.Dispatcher;
import ru.skubatko.dev.patterns.dispatcher.gb.case2.event.DateEvent;
import ru.skubatko.dev.patterns.dispatcher.gb.case2.event.TextEvent;
import ru.skubatko.dev.patterns.dispatcher.gb.case2.listener.DateListener;
import ru.skubatko.dev.patterns.dispatcher.gb.case2.listener.TestListener;
import ru.skubatko.dev.patterns.dispatcher.gb.case2.listener.TextListener;

/**
 * Async Event Dispatcher pattern example
 */
public class App {

    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();

        dispatcher.subscribe(DateEvent.class, new DateListener());
        dispatcher.subscribe(TextEvent.class, new TextListener());
        dispatcher.subscribe(TextEvent.class, new TestListener());

        dispatcher.notifyEventSubscribers(new DateEvent());
        dispatcher.notifyEventSubscribers(new TextEvent("testTextEvent!!"));

        for (int i = 0; i < 5; i++) {
            dispatcher.notifyEventSubscribersAsync(new DateEvent());
            dispatcher.notifyEventSubscribersAsync(new TextEvent("TextEvent async call"));
        }

        dispatcher.shutdown();
    }
}
