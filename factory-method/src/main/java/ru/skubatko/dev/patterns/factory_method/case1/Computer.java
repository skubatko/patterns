package ru.skubatko.dev.patterns.factory_method.case1;

public abstract class Computer {
    String ram;
    String hdd;
    String cpu;

    public abstract String getRam();

    public abstract String getHdd();

    public abstract String getCpu();

    @Override
    public String toString() {
        return "Computer{" +
                       "ram='" + ram + '\'' +
                       ", hdd='" + hdd + '\'' +
                       ", cpu='" + cpu + '\'' +
                       '}';
    }
}
