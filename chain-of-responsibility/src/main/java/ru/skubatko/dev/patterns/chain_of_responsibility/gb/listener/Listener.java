package ru.skubatko.dev.patterns.chain_of_responsibility.gb.listener;

import ru.skubatko.dev.patterns.chain_of_responsibility.gb.event.CarEvent;

public interface Listener {

    void handle(CarEvent carEvent);

}
