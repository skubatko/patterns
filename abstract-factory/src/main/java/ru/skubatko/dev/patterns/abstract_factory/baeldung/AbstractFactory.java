package ru.skubatko.dev.patterns.abstract_factory.baeldung;

public interface AbstractFactory<T> {
    T create(String type) ;
}