package ru.skubatko.dev.patterns.mediator.gb.event.process;

import ru.skubatko.dev.patterns.mediator.gb.event.CarEvent;
import ru.skubatko.dev.patterns.mediator.gb.model.Car;

public class CarReadyEvent extends CarEvent {

    public CarReadyEvent() {
    }

    public CarReadyEvent(Car car) {
        super(car);
    }

}
