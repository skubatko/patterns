package ru.skubatko.dev.patterns.mediator.gb.mediator;

import ru.skubatko.dev.patterns.mediator.gb.dispatcher.Dispatcher;
import ru.skubatko.dev.patterns.mediator.gb.event.check.CheckCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.event.check.CheckFinishedCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.event.clean.CleanCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.event.clean.CleanFinishedCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.event.process.CarReadyEvent;
import ru.skubatko.dev.patterns.mediator.gb.event.process.CarStartEvent;
import ru.skubatko.dev.patterns.mediator.gb.event.repair.RepairCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.event.repair.RepairFinishedCarEvent;
import ru.skubatko.dev.patterns.mediator.gb.listener.CheckCarListener;
import ru.skubatko.dev.patterns.mediator.gb.listener.CleanCarListener;
import ru.skubatko.dev.patterns.mediator.gb.listener.RepairCarListener;

public class CarMediator extends AbstractMediator {

    public CarMediator(Dispatcher dispatcher) {
        super(dispatcher);

        subscribe(CleanCarEvent.class, new CleanCarListener());
        subscribe(RepairCarEvent.class, new RepairCarListener());
        subscribe(CheckCarEvent.class, new CheckCarListener());

        registryAsync(CarStartEvent.class, CheckCarEvent.class);
        registryAsync(CleanFinishedCarEvent.class, CheckCarEvent.class);
        registryAsync(RepairFinishedCarEvent.class, CheckCarEvent.class);
        registryAsync(CheckFinishedCarEvent.class, CarReadyEvent.class);
    }

}
