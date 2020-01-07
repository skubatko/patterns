package ru.skubatko.dev.patterns.dispatcher.gb.case1.listener;

import ru.skubatko.dev.patterns.dispatcher.gb.case1.event.DateEvent;
import ru.skubatko.dev.patterns.dispatcher.gb.case1.event.Event;

public class DateListener implements Listener<DateEvent> {

    @Override
    public void handle(Event event) {
        System.out.println("DateListener handled event: " + event.getContent());
    }

}
