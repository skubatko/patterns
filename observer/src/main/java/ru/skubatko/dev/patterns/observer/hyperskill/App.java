package ru.skubatko.dev.patterns.observer.hyperskill;

public class App {

    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        YoutubeSubscriber subscriberA = new YoutubeSubscriber("subscriberA");
        YoutubeSubscriber subscriberB = new YoutubeSubscriber("subscriberB");
        YoutubeSubscriber subscriberC = new YoutubeSubscriber("subscriberC");
        youtubeChannel.addObserver(subscriberA);
        youtubeChannel.addObserver(subscriberB);
        youtubeChannel.addObserver(subscriberC);
        youtubeChannel.releaseNewVideo("Design Patterns : Factory Method");
        youtubeChannel.releaseNewVideo("Design Patterns : Proxy");
        youtubeChannel.releaseNewVideo("Design Patterns : Visitor");
    }
}
