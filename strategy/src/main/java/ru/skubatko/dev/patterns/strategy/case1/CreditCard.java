package ru.skubatko.dev.patterns.strategy.case1;

public class CreditCard implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("paid w/ card");
    }
}