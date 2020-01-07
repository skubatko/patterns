package ru.skubatko.dev.patterns.adapter.case1;

public class Main {

    public static void main(String[] args) {

        ChinaConnector connector = new RussianToChinaConnectorAdapter(
                () -> System.out.println("connected ..."));

        new ChinaSocket().plugIn(connector);
    }
}