package ru.skubatko.dev.patterns.strategy.case1;

public class App {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item book = new Item("545", 1000);
        Item macBook = new Item("323", 100_000);

        cart.add(book);
        cart.add(macBook);

        CreditCard card = new CreditCard();
        PayPal payPal = new PayPal();

        cart.pay(card);
        cart.pay(payPal);
    }
}