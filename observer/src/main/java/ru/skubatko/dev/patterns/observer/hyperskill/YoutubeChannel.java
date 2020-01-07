package ru.skubatko.dev.patterns.observer.hyperskill;

import java.util.ArrayList;

public class YoutubeChannel implements Observable {
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void releaseNewVideo(String video) {
        System.out.println("Release new video : " + video);
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}