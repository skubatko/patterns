package ru.skubatko.dev.patterns.template_method.hyperskill;

public class TemplateMethodDemo {

    public static void main(String[] args) {
        Worker programmer = new Programmer();
        Worker actor = new Actor();
        programmer.work();
        actor.work();
    }
}
