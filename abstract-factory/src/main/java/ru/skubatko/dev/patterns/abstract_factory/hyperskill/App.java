package ru.skubatko.dev.patterns.abstract_factory.hyperskill;

public class App {

    public static void main(String[] args) throws InterruptedException {
        Table table;
        TableInstruments tableInstruments;

        TableFactory kitchenTableFactory = new KitchenTableFactory();
        TableFactory officeTableFactory = new OfficeTableFactory();

        System.out.println("-I work as a cook. I need a kitchen table");
        System.out.println("-Got It! Give me a sec,- Calling to the KitchenTableFactory." +
                                   " - Bring me the KitchenTable with KitchenTableInstruments");
        Thread.sleep(500);

        table = kitchenTableFactory.makeTable();
        tableInstruments = kitchenTableFactory.makeTableInstruments();

        System.out.println(table.getTable() + "\n" + tableInstruments.getInstrument());
        System.out.println("-There they are!\n");
        Thread.sleep(500);

        System.out.println("-I'am office manager. I need an office table");
        System.out.println("-Got It! Give me a sec,- Calling to the OfficeTableFactory." +
                                   " - Bring me the OfficeTable with OfficeTableInstruments");
        Thread.sleep(500);

        table = officeTableFactory.makeTable();
        tableInstruments = officeTableFactory.makeTableInstruments();

        System.out.println(table.getTable() + "\n" + tableInstruments.getInstrument());
        System.out.println("-There they are!");
    }
}
