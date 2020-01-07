package ru.skubatko.dev.patterns.chain_of_responsibility.gb.listener;

import ru.skubatko.dev.patterns.chain_of_responsibility.gb.event.CarEvent;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.event.CleanCarEvent;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.event.ReturnCarEvent;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.util.Utils;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.dispatcher.Dispatcher;

public class RepairCarListener implements Listener {

    @Override
    public void handle(CarEvent event) {
        if (!(event.getCar().getClean())) {
            Dispatcher.getInstance().notifyEventSubscribersAsync(new CleanCarEvent(event.getCar()));
            return;
        }
        if (event.getCar().getReady()) {
            Dispatcher.getInstance().notifyEventSubscribersAsync(new ReturnCarEvent(event.getCar()));
            return;
        }
        System.out.println("Repairing started: car vin: " + event.getCar().getVin());
        Utils.pause(1200);
        event.getCar().setReady(true);
        System.out.println("Repairing finished: car vin: " + event.getCar().getVin());

        Dispatcher.getInstance().notifyEventSubscribersAsync(new ReturnCarEvent(event.getCar()));
    }

}
