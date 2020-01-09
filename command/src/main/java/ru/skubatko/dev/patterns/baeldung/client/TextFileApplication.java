package ru.skubatko.dev.patterns.baeldung.client;

import ru.skubatko.dev.patterns.baeldung.command.OpenTextFileOperation;
import ru.skubatko.dev.patterns.baeldung.command.SaveTextFileOperation;
import ru.skubatko.dev.patterns.baeldung.command.TextFileOperation;
import ru.skubatko.dev.patterns.baeldung.invoker.TextFileOperationExecutor;
import ru.skubatko.dev.patterns.baeldung.receiver.TextFile;

public class TextFileApplication {
    
    public static void main(String[] args) {
        
        TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("file2.txt"));
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        System.out.println(textFileOperationExecutor.executeOperation(openTextFileOperation));
        System.out.println(textFileOperationExecutor.executeOperation(saveTextFileOperation));
    }   
}
