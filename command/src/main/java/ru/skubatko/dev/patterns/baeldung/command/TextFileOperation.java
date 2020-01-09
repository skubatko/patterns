package ru.skubatko.dev.patterns.baeldung.command;

@FunctionalInterface
public interface TextFileOperation {
    
    String execute();
    
}
