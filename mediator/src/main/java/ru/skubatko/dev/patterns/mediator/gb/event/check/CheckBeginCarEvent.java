package ru.skubatko.dev.patterns.mediator.gb.event.check;

import ru.skubatko.dev.patterns.mediator.gb.event.CarEvent;
import ru.skubatko.dev.patterns.mediator.gb.model.Car;

public class CheckBeginCarEvent extends CarEvent {

    public CheckBeginCarEvent(Car car) {
        super(car);
    }
}
