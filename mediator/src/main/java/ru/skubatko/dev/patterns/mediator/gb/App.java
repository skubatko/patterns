package ru.skubatko.dev.patterns.mediator.gb;

import ru.skubatko.dev.patterns.mediator.gb.dispatcher.Dispatcher;
import ru.skubatko.dev.patterns.mediator.gb.event.process.CarReadyEvent;
import ru.skubatko.dev.patterns.mediator.gb.event.process.CarStartEvent;
import ru.skubatko.dev.patterns.mediator.gb.mediator.CarMediator;
import ru.skubatko.dev.patterns.mediator.gb.model.Car;

/**
 * Mediator pattern.
 */
public class App {

    public static void main(String[] args) {
        Dispatcher dispatcher = Dispatcher.getInstance();
        CarMediator mediator = new CarMediator(dispatcher);

        mediator.subscribe(CarReadyEvent.class,
                carEvent -> System.out.println("Car is Ready: vin: " + carEvent.getCar().getVin()));

        Car car1 = new Car();
        car1.setClean(false);
        car1.setReady(true);
        dispatcher.notifyEventSubscribersAsync(new CarStartEvent(car1));

        Car car2 = new Car();
        car2.setClean(false);
        car2.setReady(false);
        dispatcher.notifyEventSubscribersAsync(new CarStartEvent(car2));

        dispatcher.shutdown();
    }
}