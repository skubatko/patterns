package ru.skubatko.dev.patterns.facade.hyperskill;

class Engine {
    private String description;

    Engine() {
        this.description = "Engine";
    }

    void on() {
        System.out.println(description + " is on");
    }

    void off() {
        System.out.println(description + " is off");
    }
}
