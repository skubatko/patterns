package ru.skubatko.dev.patterns.singleton.case1;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.check();
    }
}
