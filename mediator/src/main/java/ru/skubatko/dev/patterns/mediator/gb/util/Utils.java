package ru.skubatko.dev.patterns.mediator.gb.util;

public enum Utils {
    ;

    public static void pause(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
