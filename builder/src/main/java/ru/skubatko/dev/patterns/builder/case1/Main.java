package ru.skubatko.dev.patterns.builder.case1;

public class Main {

    public static void main(String[] args) {
        Person.PersonBuilder personBuilder = new Person.PersonBuilder();
        Person p = personBuilder.setName("Kolya").setEmail("kolya@gmail.com").createPerson();
        System.out.println(p.toString());
    }
}