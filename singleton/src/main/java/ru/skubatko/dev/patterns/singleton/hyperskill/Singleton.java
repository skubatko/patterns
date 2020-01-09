package ru.skubatko.dev.patterns.singleton.hyperskill;

class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {
        return instance;
    }
}
