package ru.skubatko.dev.patterns.abstract_factory.baeldung;

public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String colorType) {
        if ("Brown".equalsIgnoreCase(colorType)) {
            return new Brown();
        } else if ("White".equalsIgnoreCase(colorType)) {
            return new White();
        }

        return null;
    }

}
