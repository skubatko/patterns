package ru.skubatko.dev.patterns.mediator.gb.event;

import ru.skubatko.dev.patterns.mediator.gb.model.Car;

public abstract class CarEvent {

    private Car car;

    public CarEvent() {
        System.out.println("Event: " + this.getClass().getName());
    }

    public CarEvent(Car car) {
        System.out.println("Event: " + this.getClass().getName());
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
