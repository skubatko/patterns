package ru.skubatko.dev.patterns.facade.hyperskill;

public class App {

    public static void main(String[] args) throws InterruptedException {
        Engine engine = new Engine();
        StereoSystem stereoSystem = new StereoSystem();
        HeatedSeats heatedSeats = new HeatedSeats();

        CarFacade carFacade = new CarFacade(engine, heatedSeats, stereoSystem);

        carFacade.turnOnCar();
        System.out.println();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1500);
            System.out.println("Driving to work... " + i + "km");
            switch (i) {
                case 1:
                    Thread.sleep(500);
                    carFacade.playTrack("Queen - Bohemian Rhapsody");
                    break;
                case 2:
                    Thread.sleep(500);
                    carFacade.playTrack("Queen - I want to break free");
                    break;
                case 3:
                    Thread.sleep(500);
                    carFacade.playTrack("Queen - Another one bites the dust");
                    break;
                case 4:
                    Thread.sleep(500);
                    carFacade.playTrack("Queen - Scandal");
                    break;
            }
        }
        System.out.println("\nWe have arrived");
        Thread.sleep(1000);
        carFacade.turnOffCar();
    }
}
