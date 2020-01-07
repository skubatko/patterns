package ru.skubatko.dev.patterns.dispatcher.gb.case2.listener;

import ru.skubatko.dev.patterns.dispatcher.gb.case2.event.Event;
import ru.skubatko.dev.patterns.dispatcher.gb.case2.event.TextEvent;

public class TestListener implements Listener<TextEvent> {

    @Override
    public void handle(Event event) {
        System.out.println(Thread.currentThread().getId() + ": TestListener handled event: " + event.getContent());
    }

}
