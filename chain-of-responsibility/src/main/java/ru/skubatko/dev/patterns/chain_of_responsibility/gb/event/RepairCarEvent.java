package ru.skubatko.dev.patterns.chain_of_responsibility.gb.event;

import ru.skubatko.dev.patterns.chain_of_responsibility.gb.model.Car;

public class RepairCarEvent extends CarEvent {

    public RepairCarEvent(Car car) {
        super(car);
    }

}
