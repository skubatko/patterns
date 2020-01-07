package ru.skubatko.dev.patterns.mediator.gb.event.repair;

import ru.skubatko.dev.patterns.mediator.gb.event.CarEvent;
import ru.skubatko.dev.patterns.mediator.gb.model.Car;

public class RepairCarEvent extends CarEvent {

    public RepairCarEvent(Car car) {
        super(car);
    }

}
