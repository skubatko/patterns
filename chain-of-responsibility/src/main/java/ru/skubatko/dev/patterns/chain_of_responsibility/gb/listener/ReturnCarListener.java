package ru.skubatko.dev.patterns.chain_of_responsibility.gb.listener;

import ru.skubatko.dev.patterns.chain_of_responsibility.gb.event.CarEvent;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.event.CleanCarEvent;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.event.ReturnCarEvent;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.util.Utils;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.dispatcher.Dispatcher;

public class ReturnCarListener implements Listener {

    @Override
    public void handle(CarEvent event) {
        if (!(event.getCar().getClean())) {
            Dispatcher.getInstance().notifyEventSubscribers(new CleanCarEvent(event.getCar()));
            return;
        }
        if (!(event.getCar().getReady())) {
            Dispatcher.getInstance().notifyEventSubscribers(new ReturnCarEvent(event.getCar()));
            return;
        }
        System.out.println("Return started: car vin: " + event.getCar().getVin());
        Utils.pause(300);
        event.getCar().setClean(true);
        System.out.println("Return finished: car vin: " + event.getCar().getVin());
    }

}
