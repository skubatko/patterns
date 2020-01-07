package ru.skubatko.dev.patterns.mediator.gb.event.repair;

import ru.skubatko.dev.patterns.mediator.gb.event.CarEvent;
import ru.skubatko.dev.patterns.mediator.gb.model.Car;

public class RepairFinishedCarEvent extends CarEvent {

    public RepairFinishedCarEvent(Car car) {
        super(car);
    }

}
