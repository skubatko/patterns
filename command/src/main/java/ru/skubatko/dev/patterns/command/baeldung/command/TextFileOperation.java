/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2020 VTB Group. All rights reserved.
 */

package ru.skubatko.dev.patterns.command.baeldung.command;

@FunctionalInterface
public interface TextFileOperation {
    
    String execute();
    
}
