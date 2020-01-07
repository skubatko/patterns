package ru.skubatko.dev.patterns.mediator.gb.listener;

import ru.skubatko.dev.patterns.mediator.gb.dispatcher.Dispatcher;
import ru.skubatko.dev.patterns.mediator.gb.event.check.CheckBeginCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.event.check.CheckCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.event.check.CheckFinishedCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.event.clean.CleanCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.event.repair.RepairCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.util.Utils;

public class CheckCarListener implements Listener<CheckCarEvent> {

    @Override
    public void handle(CheckCarEvent event) {

        System.out.println("Checking started: car vin: " + event.getCar().getVin());
        Dispatcher.getInstance().notifyEventSubscribersAsync(new CheckBeginCarEvent(event.getCar()));

        Utils.pause(100);
        if (!(event.getCar().getClean())) {
            Dispatcher.getInstance().notifyEventSubscribersAsync(new CleanCarEvent(event.getCar()));
            return;
        }

        Utils.pause(100);
        if (!(event.getCar().getReady())) {
            Dispatcher.getInstance().notifyEventSubscribersAsync(new RepairCarEvent(event.getCar()));
            return;
        }

        Dispatcher.getInstance().notifyEventSubscribersAsync(new CheckFinishedCarEvent(event.getCar()));
        System.out.println("Checking finished: car vin: " + event.getCar().getVin());
    }

}
