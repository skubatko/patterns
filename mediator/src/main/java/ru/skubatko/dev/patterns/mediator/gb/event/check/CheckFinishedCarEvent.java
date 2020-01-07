package ru.skubatko.dev.patterns.mediator.gb.event.check;

import ru.skubatko.dev.patterns.mediator.gb.event.CarEvent;
import ru.skubatko.dev.patterns.mediator.gb.model.Car;

public class CheckFinishedCarEvent extends CarEvent {

    public CheckFinishedCarEvent(Car car) {
        super(car);
    }
}
