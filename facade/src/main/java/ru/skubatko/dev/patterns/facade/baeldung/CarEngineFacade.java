package ru.skubatko.dev.patterns.facade.baeldung;

import ru.skubatko.dev.patterns.facade.baeldung.carsystem.AirFlowController;
import ru.skubatko.dev.patterns.facade.baeldung.carsystem.CatalyticConverter;
import ru.skubatko.dev.patterns.facade.baeldung.carsystem.CoolingController;
import ru.skubatko.dev.patterns.facade.baeldung.carsystem.FuelInjector;
import ru.skubatko.dev.patterns.facade.baeldung.carsystem.Starter;

public class CarEngineFacade {
    private static final Integer DEFAULT_COOLING_TEMP = 90;
    private static final Integer MAX_ALLOWED_TEMP = 50;
    private FuelInjector fuelInjector = new FuelInjector();
    private AirFlowController airFlowController = new AirFlowController();
    private Starter starter = new Starter();
    private CoolingController coolingController = new CoolingController();
    private CatalyticConverter catalyticConverter = new CatalyticConverter();

    public void startEngine(){
        fuelInjector.on();
        airFlowController.takeAir();
        fuelInjector.on();
        fuelInjector.inject();
        starter.start();
        coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP);
        coolingController.run();
        catalyticConverter.on();
    }

    public void stopEngine(){
        fuelInjector.off();
        catalyticConverter.off();
        coolingController.cool(MAX_ALLOWED_TEMP);
        coolingController.stop();
        airFlowController.off();
    }
}
