/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2020 VTB Group. All rights reserved.
 */

package ru.skubatko.dev.patterns.command.baeldung.command;

import ru.skubatko.dev.patterns.command.baeldung.receiver.TextFile;

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
