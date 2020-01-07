package ru.skubatko.dev.patterns.observer.hyperskill;

public interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
