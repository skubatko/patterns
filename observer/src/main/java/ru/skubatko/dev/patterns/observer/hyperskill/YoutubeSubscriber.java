package ru.skubatko.dev.patterns.observer.hyperskill;

public class YoutubeSubscriber implements Observer {

    private String name;

    public YoutubeSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + ": New video on channel!");
    }
}
