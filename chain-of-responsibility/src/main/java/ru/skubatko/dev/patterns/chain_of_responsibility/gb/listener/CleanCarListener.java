package ru.skubatko.dev.patterns.chain_of_responsibility.gb.listener;

import ru.skubatko.dev.patterns.chain_of_responsibility.gb.dispatcher.Dispatcher;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.event.CarEvent;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.event.RepairCarEvent;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.util.Utils;

public class CleanCarListener implements Listener {

    @Override
    public void handle(CarEvent event) {
        if (event.getCar().getClean()) {
            Dispatcher.getInstance().notifyEventSubscribers(new RepairCarEvent(event.getCar()));
            return;
        }
        System.out.println("Cleaning started: car vin: " + event.getCar().getVin());
        Utils.pause(500);
        event.getCar().setClean(true);
        System.out.println("Cleaning finished: car vin: " + event.getCar().getVin());
        Dispatcher.getInstance().notifyEventSubscribers(new RepairCarEvent(event.getCar()));
    }

}
