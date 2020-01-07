package ru.skubatko.dev.patterns.observer.case1;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {
    private String name;
    private List<Observer> observers;
    private String msg;
    private boolean isChanged;

    public Topic(String name) {
        this.name = name;
        observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unsubscribe(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
        isChanged = false;
    }

    @Override
    public Object getUpdate(Observer observer) {
        return msg;
    }

    public void postMsg(String msg) {
        this.msg = msg;
        System.out.println("new msg in blog on topic: " + name + " appeared: " + msg);
        isChanged = true;
        notifyObservers();
    }

    @Override
    public String toString() {
        return name;
    }
}