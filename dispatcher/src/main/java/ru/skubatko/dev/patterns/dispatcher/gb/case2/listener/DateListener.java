package ru.skubatko.dev.patterns.dispatcher.gb.case2.listener;

import ru.skubatko.dev.patterns.dispatcher.gb.case2.event.DateEvent;
import ru.skubatko.dev.patterns.dispatcher.gb.case2.event.Event;

public class DateListener implements Listener<DateEvent> {

    @Override
    public void handle(Event event) {
        System.out.println(Thread.currentThread().getId() + ": DateListener handled event: " + event.getContent());
    }

}
