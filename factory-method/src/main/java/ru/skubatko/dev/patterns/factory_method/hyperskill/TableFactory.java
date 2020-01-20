package ru.skubatko.dev.patterns.factory_method.hyperskill;

abstract class TableFactory {

    abstract Table createTable(String type);

    Table orderTable(String type) throws InterruptedException {
        Table table = createTable(type);
        if (table == null) {
            System.out.println("Sorry, we are not able to create this kind of table\n");
            return null;
        }
        System.out.println("Making a " + table.getName());
        table.attachLegs();
        table.attachTableTop();
        Thread.sleep(1500L);
        System.out.println("Done a " + table.getName() + "\n");
        return table;
    }
}
