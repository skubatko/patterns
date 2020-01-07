package ru.skubatko.dev.patterns.mediator.gb.listener;

import ru.skubatko.dev.patterns.mediator.gb.dispatcher.Dispatcher;
import ru.skubatko.dev.patterns.mediator.gb.event.clean.CleanBeginCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.event.clean.CleanCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.event.clean.CleanFinishedCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.util.Utils;

public class CleanCarListener implements Listener<CleanCarEvent> {

    @Override
    public void handle(CleanCarEvent event) {
        System.out.println("Cleaning started: car vin: " + event.getCar().getVin());
        Dispatcher.getInstance().notifyEventSubscribersAsync(new CleanBeginCarEvent(event.getCar()));
        Utils.pause(500);
        event.getCar().setClean(true);
        Dispatcher.getInstance().notifyEventSubscribersAsync(new CleanFinishedCarEvent(event.getCar()));
        System.out.println("Cleaning finished: car vin: " + event.getCar().getVin());
    }

}
