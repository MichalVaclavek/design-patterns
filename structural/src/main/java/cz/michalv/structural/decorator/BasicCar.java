package cz.michalv.structural.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * The basic implementation of the component interface.
 * We can have BasicCar class as our component implementation.
 */
@Slf4j
public class BasicCar implements Car {

    @Override
    public void assemble() {
        log.info("Basic Car.");
    }
}
