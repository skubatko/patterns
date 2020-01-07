package ru.skubatko.dev.patterns.chain_of_responsibility.gb.event;

import ru.skubatko.dev.patterns.chain_of_responsibility.gb.model.Car;

public class ReturnCarEvent extends CarEvent {

    public ReturnCarEvent(Car car) {
        super(car);
    }

}
