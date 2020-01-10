package ru.skubatko.dev.patterns.abstract_factory.hyperskill;

public class OfficeTableFactory implements TableFactory {

    @Override
    public Table makeTable() {
        return new OfficeTable();
    }

    @Override
    public TableInstruments makeTableInstruments() {
        return new OfficeTableInstrument();
    }
}
