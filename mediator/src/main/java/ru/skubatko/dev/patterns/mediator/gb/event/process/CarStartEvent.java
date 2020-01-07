package ru.skubatko.dev.patterns.mediator.gb.event.process;

import ru.skubatko.dev.patterns.mediator.gb.event.CarEvent;
import ru.skubatko.dev.patterns.mediator.gb.model.Car;

public class CarStartEvent extends CarEvent {

    public CarStartEvent(Car car) {
        super(car);
    }

}
