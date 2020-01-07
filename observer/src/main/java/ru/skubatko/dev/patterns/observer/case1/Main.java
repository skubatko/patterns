package ru.skubatko.dev.patterns.observer.case1;

public class Main {

    public static void main(String[] args) {
        Topic topic1 = new Topic("apples");
        Topic topic2 = new Topic("oranges");

        Observer subscriber1 = new Subscriber("Vasya");
        Observer subscriber2 = new Subscriber("Petya");
        Observer subscriber3 = new Subscriber("Kolya");
        Observer subscriber4 = new Subscriber("Masha");
        Observer subscriber5 = new Subscriber("Dasha");

        subscriber1.addSubject(topic1);
        subscriber2.addSubject(topic1);
        subscriber3.addSubject(topic1);
        subscriber4.addSubject(topic2);
        subscriber5.addSubject(topic2);
        subscriber3.addSubject(topic2);

        topic1.subscribe(subscriber1);
        topic1.subscribe(subscriber2);
        topic1.subscribe(subscriber3);
        topic2.subscribe(subscriber4);
        topic2.subscribe(subscriber5);
        topic2.subscribe(subscriber3);

        topic1.postMsg("apple1");
        topic1.postMsg("apple2");
        topic1.postMsg("apple3");
        topic2.postMsg("orange1");
        topic2.postMsg("orange2");

        topic2.unsubscribe(subscriber3);
        topic2.postMsg("orange3");
    }
}