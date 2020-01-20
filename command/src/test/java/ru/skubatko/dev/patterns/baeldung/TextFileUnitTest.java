package ru.skubatko.dev.patterns.baeldung;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import ru.skubatko.dev.patterns.command.baeldung.receiver.TextFile;

import org.junit.BeforeClass;
import org.junit.Test;

public class TextFileUnitTest {
    
    private static TextFile textFile;
    
    
    @BeforeClass
    public static void setUpTextFileInstance() {
        textFile = new TextFile("file1.txt");
    }
    
    @Test
    public void givenTextFileInstance_whenCalledOpenMethod_thenOneAssertion() {
        assertThat(textFile.open()).isEqualTo("Opening file file1.txt");
    }
    
    @Test
    public void givenTextFileInstance_whenCalledReadMethod_thenOneAssertion() {
        assertThat(textFile.read()).isEqualTo("Reading file file1.txt");
    }

    @Test
    public void givenTextFileInstance_whenCalledWriteMethod_thenOneAssertion() {
        assertThat(textFile.write()).isEqualTo("Writing to file file1.txt");
    }
    
    @Test
    public void givenTextFileInstance_whenCalledSaveMethod_thenOneAssertion() {
        assertThat(textFile.save()).isEqualTo("Saving file file1.txt");
    }
    
    @Test
    public void givenTextFileInstance_whenCalledCopyMethod_thenOneAssertion() {
        assertThat(textFile.copy()).isEqualTo("Copying file file1.txt");
    }
    
    @Test
    public void givenTextFileInstance_whenCalledPasteMethod_thenOneAssertion() {
        assertThat(textFile.paste()).isEqualTo("Pasting file file1.txt");
    }
}
