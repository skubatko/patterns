package ru.skubatko.dev.patterns.abstract_factory.case1;

public class ElfWarrior implements Warrior {
    @Override
    public void closeAttack() {
        System.out.println("ElfWarrior attacks ...");
    }
}
