package ru.skubatko.dev.patterns.observer.case1;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer {
    private String name;
    private List<Subject> topics;

    public Subscriber(String name) {
        this.name = name;
        topics = new ArrayList<>();
    }

    @Override
    public void addSubject(Subject subject) {
        topics.add(subject);
    }

    @Override
    public void removeSubject(Subject subject) {
        topics.remove(subject);
    }

    @Override
    public void update() {
        for (Subject topic : topics) {
            String msg = (String) topic.getUpdate(this);
            if (msg == null) {
                System.out.println("subscriber " + name + ": no changes on topic: " + topic);
            } else {
                System.out.println("subscriber " + name + ": on topic: " + topic + " new msg in blog: " + msg);
            }
        }
    }
}