package ru.skubatko.dev.patterns.facade.hyperskill;

class HeatedSeats {
    private String description;
    private int heatLevel;

    HeatedSeats() {
        this.description = "HeatedSeats System";
    }

    void on() {
        heatLevel = 1;
        System.out.println(description + " is on");
    }

    void off() {
        heatLevel = 0;
        System.out.println(description + " is off");
    }

    void increaseHeatLevel() {
        if (heatLevel == 0) {
            on();
        } else if (heatLevel == 1 || heatLevel == 2) {
            heatLevel++;
        } else {
            off();
        }
    }
}
