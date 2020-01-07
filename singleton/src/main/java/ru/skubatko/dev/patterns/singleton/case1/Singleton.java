package ru.skubatko.dev.patterns.singleton.case1;

public final class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void check() {
        System.out.println("instance is not null: " + (instance != null));
    }
}