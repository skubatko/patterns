package ru.skubatko.dev.patterns.factory_method.hyperskill;

abstract class Table {
    private String name;

    Table(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void attachLegs() {
        System.out.println("Attaching Legs");
    }

    void attachTableTop() {
        System.out.println("Attaching tabletop");
    }
}
