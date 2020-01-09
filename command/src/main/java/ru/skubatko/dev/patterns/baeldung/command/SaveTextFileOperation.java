package ru.skubatko.dev.patterns.baeldung.command;

import ru.skubatko.dev.patterns.baeldung.receiver.TextFile;

public class SaveTextFileOperation implements TextFileOperation {
    
    private final TextFile textFile;
    
    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }
    
    @Override
    public String execute() {
        return textFile.save();
    }
}
