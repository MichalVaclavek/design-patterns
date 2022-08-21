package cz.michalv.structural.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * Concrete Decorators - Extending the base decorator functionality and modifying the component behavior accordingly.
 * We can have concrete decorator classes as LuxuryCar and SportsCar.
 */
@Slf4j
public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        log.info(" Adding features of Luxury Car.");
    }
}
