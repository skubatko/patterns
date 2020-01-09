package ru.skubatko.dev.patterns.singleton.hyperskill;

public class App {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1 == s2); // true because s1 and s2 refer the same object
        System.out.println(s2 == s3); // true because s2 and s3 refer the same object
    }
}
