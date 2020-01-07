package ru.skubatko.dev.patterns.chain_of_responsibility.gb.event;

import ru.skubatko.dev.patterns.chain_of_responsibility.gb.model.Car;

public abstract class CarEvent {

    private Car car;

    public CarEvent(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
