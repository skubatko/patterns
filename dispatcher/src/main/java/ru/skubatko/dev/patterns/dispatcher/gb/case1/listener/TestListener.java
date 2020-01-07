package ru.skubatko.dev.patterns.dispatcher.gb.case1.listener;


import ru.skubatko.dev.patterns.dispatcher.gb.case1.event.Event;
import ru.skubatko.dev.patterns.dispatcher.gb.case1.event.TextEvent;

public class TestListener implements Listener<TextEvent> {

    @Override
    public void handle(Event event) {
        System.out.println("TestListener handled event: " + event.getContent());
    }

}
