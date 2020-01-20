package ru.skubatko.dev.patterns.command.hyperskill;

public class HomeAutomationDemo {

    public static void main(String[] args) {

        Controller controller = new Controller();
        Light light = new Light();

        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        controller.setCommand(lightsOn);
        controller.executeCommand();

        controller.setCommand(lightsOff);
        controller.executeCommand();
    }
}
