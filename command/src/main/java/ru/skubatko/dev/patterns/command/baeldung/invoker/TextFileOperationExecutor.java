/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2020 VTB Group. All rights reserved.
 */

package ru.skubatko.dev.patterns.command.baeldung.invoker;

import ru.skubatko.dev.patterns.command.baeldung.command.TextFileOperation;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {
    
    private final List<TextFileOperation> textFileOperations = new ArrayList<>();
    
    public String executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }
}
