package ru.skubatko.dev.patterns.chain_of_responsibility.gb.event;

import ru.skubatko.dev.patterns.chain_of_responsibility.gb.model.Car;

public class CleanCarEvent extends CarEvent {

    public CleanCarEvent(Car car) {
        super(car);
    }
}
