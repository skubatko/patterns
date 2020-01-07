package ru.skubatko.dev.patterns.mediator.gb.event.check;

import ru.skubatko.dev.patterns.mediator.gb.event.CarEvent;
import ru.skubatko.dev.patterns.mediator.gb.model.Car;

public class CheckCarEvent extends CarEvent {

    public CheckCarEvent() {
    }

    public CheckCarEvent(Car car) {
        super(car);
    }
}
