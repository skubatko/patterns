package ru.skubatko.dev.patterns.adapter.case1;

public class RussianToChinaConnectorAdapter implements ChinaConnector {
    private RussianConnector russianConnector;

    public RussianToChinaConnectorAdapter(RussianConnector russianConnector) {
        this.russianConnector = russianConnector;
    }

    @Override
    public void giveElectricity() {
        russianConnector.provideElectricity();
    }
}
