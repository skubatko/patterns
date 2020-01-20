package ru.skubatko.dev.patterns.factory_method.case1;

public class App {

    public static void main(String[] args) {
        Computer computer = ComputerFactory.getComputer( "PC", "16Gb", "1Tb", "i5 7200" );
        System.out.println(computer);
    }
}
