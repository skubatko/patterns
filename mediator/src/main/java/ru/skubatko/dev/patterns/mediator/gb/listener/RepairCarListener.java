package ru.skubatko.dev.patterns.mediator.gb.listener;

import ru.skubatko.dev.patterns.mediator.gb.dispatcher.Dispatcher;
import ru.skubatko.dev.patterns.mediator.gb.event.repair.RepairBeginCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.event.repair.RepairCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.event.repair.RepairFinishedCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.util.Utils;

public class RepairCarListener implements Listener<RepairCarEvent> {

    @Override
    public void handle(RepairCarEvent event) {
        System.out.println("Repairing started: car vin: " + event.getCar().getVin());
        Dispatcher.getInstance().notifyEventSubscribersAsync(new RepairBeginCarEvent(event.getCar()));
        Utils.pause(1200);
        event.getCar().setReady(true);
        Dispatcher.getInstance().notifyEventSubscribersAsync(new RepairFinishedCarEvent(event.getCar()));
        System.out.println("Repairing finished: car vin: " + event.getCar().getVin());
    }

}
