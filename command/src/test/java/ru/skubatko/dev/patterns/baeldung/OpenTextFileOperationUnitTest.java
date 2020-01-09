package ru.skubatko.dev.patterns.baeldung;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import ru.skubatko.dev.patterns.baeldung.command.OpenTextFileOperation;
import ru.skubatko.dev.patterns.baeldung.command.TextFileOperation;
import ru.skubatko.dev.patterns.baeldung.receiver.TextFile;

import org.junit.Test;

public class OpenTextFileOperationUnitTest {
    
    @Test
    public void givenOpenTextFileOperationIntance_whenCalledExecuteMethod_thenOneAssertion() {
        TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
        assertThat(openTextFileOperation.execute()).isEqualTo("Opening file file1.txt");
    }
}
