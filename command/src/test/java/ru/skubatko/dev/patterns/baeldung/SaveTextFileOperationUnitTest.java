package ru.skubatko.dev.patterns.baeldung;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import ru.skubatko.dev.patterns.baeldung.command.SaveTextFileOperation;
import ru.skubatko.dev.patterns.baeldung.command.TextFileOperation;
import ru.skubatko.dev.patterns.baeldung.receiver.TextFile;

import org.junit.Test;

public class SaveTextFileOperationUnitTest {
    
    @Test
    public void givenSaveTextFileOperationIntance_whenCalledExecuteMethod_thenOneAssertion() {
        TextFileOperation openTextFileOperation = new SaveTextFileOperation(new TextFile("file1.txt"));
        assertThat(openTextFileOperation.execute()).isEqualTo("Saving file file1.txt");
    }
}
