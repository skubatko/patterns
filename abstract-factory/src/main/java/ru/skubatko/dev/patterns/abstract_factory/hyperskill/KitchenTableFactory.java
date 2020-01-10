package ru.skubatko.dev.patterns.abstract_factory.hyperskill;

public class KitchenTableFactory implements TableFactory {

    @Override
    public Table makeTable() {
        return new KitchenTable();
    }

    @Override
    public TableInstruments makeTableInstruments() {
        return new KitchenTableInstrument();
    }
}
