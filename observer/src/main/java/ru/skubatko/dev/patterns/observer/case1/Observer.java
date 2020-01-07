package ru.skubatko.dev.patterns.observer.case1;

public interface Observer {
    void addSubject(Subject subject);

    void removeSubject(Subject subject);

    void update();
}