package ru.skubatko.dev.patterns.mediator.gb.event.clean;

import ru.skubatko.dev.patterns.mediator.gb.event.CarEvent;
import ru.skubatko.dev.patterns.mediator.gb.model.Car;

public class CleanFinishedCarEvent extends CarEvent {

    public CleanFinishedCarEvent(Car car) {
        super(car);
    }
}
