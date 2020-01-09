package ru.skubatko.dev.patterns.singleton.baeldung;

public class SingletonDriver {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.toString());
    }
}
