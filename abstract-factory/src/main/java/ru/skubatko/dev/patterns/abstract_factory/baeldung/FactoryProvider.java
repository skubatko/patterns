package ru.skubatko.dev.patterns.abstract_factory.baeldung;

public class FactoryProvider {
    public static AbstractFactory getFactory(String type){
        
        if("Toy".equalsIgnoreCase(type)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(type)){
            return new ColorFactory();
        }
        
        return null;
    }
}