package ru.skubatko.dev.patterns.factory.case1;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        }
        if ("Laptop".equalsIgnoreCase(type)) {
            return new Laptop(ram, hdd, cpu);
        }
        return null;
    }
}