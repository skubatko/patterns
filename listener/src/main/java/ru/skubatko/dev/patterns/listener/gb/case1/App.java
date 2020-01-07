package ru.skubatko.dev.patterns.listener.gb.case1;

/**
 * Listener pattern example
 */
public class App {

    public static void main(String[] args) {
        Listener listener = () -> System.out.println("handle it!!");
        listener.handle();
    }
}
