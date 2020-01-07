package ru.skubatko.dev.patterns.observer.gb;

/**
 * Observer pattern
 */
public class App {

    public static void main(String[] args) {
        Observer observer = new Observer();

        observer.subscribe(
                event -> System.out.println("Subscriber 1 event " + event.getMessage() + " handled"));

        observer.subscribe(
                event -> System.out.println("Subscriber 2 event " + event.getMessage() + " handled"));

        observer.notifySubscribers(new Event("testEvent1"));
        observer.notifySubscribers(new Event("testEvent2"));
    }
}
