package ru.skubatko.dev.patterns.abstract_factory.case1;

public abstract class SquadFactory {
    public abstract Mage createMage();
    public abstract Archer createArcher();
    public abstract Warrior createWarrior();
}
