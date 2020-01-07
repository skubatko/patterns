package ru.skubatko.dev.patterns.factory.case1;

public class Main {

    public static void main(String[] args) {
        Computer computer = ComputerFactory.getComputer( "PC", "16Gb", "1Tb", "i5 7200" );
        System.out.println(computer);
    }
}