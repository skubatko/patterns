package ru.skubatko.dev.patterns.template_method.baeldung.model;

import java.util.HashMap;
import java.util.Map;

public class Computer {
    
    private Map<String, String> computerParts = new HashMap<>();
    
    public Computer(Map<String, String> computerParts) {
        this.computerParts = computerParts;
    }
    
    public Map<String, String> getComputerParts() {
        return computerParts;
    }
}
