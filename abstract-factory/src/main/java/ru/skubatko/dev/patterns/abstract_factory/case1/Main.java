package ru.skubatko.dev.patterns.abstract_factory.case1;

public class Main {

    public static void main(String[] args) {
        SquadFactory factory = new ElfFactory();
        Archer archer =factory.createArcher();
        Mage mage = factory.createMage();
        Warrior warrior = factory.createWarrior();

        archer.shoot();
        mage.cast();
        warrior.closeAttack();
    }
}