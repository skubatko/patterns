package ru.skubatko.dev.patterns.template_method.baeldung.application;

import ru.skubatko.dev.patterns.template_method.baeldung.model.Computer;
import ru.skubatko.dev.patterns.template_method.baeldung.model.ComputerBuilder;
import ru.skubatko.dev.patterns.template_method.baeldung.model.HighEndComputerBuilder;
import ru.skubatko.dev.patterns.template_method.baeldung.model.StandardComputerBuilder;

public class Application {

    public static void main(String[] args) {
        ComputerBuilder standardComputerBuilder = new StandardComputerBuilder();
        Computer standardComputer = standardComputerBuilder.buildComputer();
        standardComputer.getComputerParts().forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));

        ComputerBuilder highEndComputerBuilder = new HighEndComputerBuilder();
        Computer highEndComputer = highEndComputerBuilder.buildComputer();
        highEndComputer.getComputerParts().forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));
    }
}
