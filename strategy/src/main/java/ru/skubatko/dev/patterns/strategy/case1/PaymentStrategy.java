package ru.skubatko.dev.patterns.strategy.case1;

@FunctionalInterface
public interface PaymentStrategy {

    void pay(int amount);
}