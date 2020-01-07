package ru.skubatko.dev.patterns.chain_of_responsibility.gb;

import ru.skubatko.dev.patterns.chain_of_responsibility.gb.dispatcher.Dispatcher;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.event.CleanCarEvent;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.event.RepairCarEvent;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.event.ReturnCarEvent;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.listener.CleanCarListener;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.listener.RepairCarListener;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.listener.ReturnCarListener;
import ru.skubatko.dev.patterns.chain_of_responsibility.gb.model.Car;

/**
 * Auto Service Emulation
 * Chain of responsibility pattern
 */
public class App {

    public static void main(String[] args) {
        Dispatcher dispatcher = Dispatcher.getInstance();

        dispatcher.subscribe(CleanCarEvent.class, new CleanCarListener());
        dispatcher.subscribe(RepairCarEvent.class, new RepairCarListener());
        dispatcher.subscribe(ReturnCarEvent.class, new ReturnCarListener());

        Car car1 = new Car();
        car1.setClean(false);
        car1.setReady(true);
        dispatcher.notifyEventSubscribersAsync(new RepairCarEvent(car1));

        Car car2 = new Car();
        car2.setClean(false);
        car2.setReady(false);
        dispatcher.notifyEventSubscribers(new RepairCarEvent(car2));

        Car car3 = new Car();
        car3.setClean(true);
        car3.setReady(false);
        dispatcher.notifyEventSubscribersAsync(new RepairCarEvent(car3));

        dispatcher.shutdown();
    }

}
