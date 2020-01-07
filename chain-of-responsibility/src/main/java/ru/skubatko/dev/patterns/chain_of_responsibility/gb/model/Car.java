package ru.skubatko.dev.patterns.chain_of_responsibility.gb.model;

import java.util.UUID;

public class Car {

    private String vin = UUID.randomUUID().toString();

    private Boolean clean = false;

    private Boolean ready = false;

    public Car() {
    }

    public String getVin() {
        return vin;
    }

    public Boolean getClean() {
        return clean;
    }

    public void setClean(Boolean clean) {
        this.clean = clean;
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }
}
