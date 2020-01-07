package ru.skubatko.dev.patterns.strategy.case1;

public class PayPal implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("paid w/ PayPal");
    }
}