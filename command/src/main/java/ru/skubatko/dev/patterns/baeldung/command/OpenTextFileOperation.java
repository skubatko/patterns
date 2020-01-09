package ru.skubatko.dev.patterns.baeldung.command;

import ru.skubatko.dev.patterns.baeldung.receiver.TextFile;

public class OpenTextFileOperation implements TextFileOperation {

    private final TextFile textFile;
    
    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }
    
    @Override
    public String execute() {
        return textFile.open();
    }
}
