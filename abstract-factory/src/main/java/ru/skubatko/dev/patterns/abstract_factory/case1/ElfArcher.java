package ru.skubatko.dev.patterns.abstract_factory.case1;

public class ElfArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("ElfArcher shoots ...");
    }
}
