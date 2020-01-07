package ru.skubatko.dev.patterns.observer.case1;

public interface Subject {

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers();

    Object getUpdate(Observer observer);
}