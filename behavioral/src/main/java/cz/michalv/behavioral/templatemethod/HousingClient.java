package cz.michalv.behavioral.templatemethod;

import lombok.extern.slf4j.Slf4j;

/**
 * Notice that client is invoking the template method of base class and depending of implementation of different steps,
 * it’s using some of the methods from base class and some of them from subclass.
 */
@Slf4j
public class HousingClient {

    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        log.info("************");

        houseType = new GlassHouse();

        houseType.buildHouse();

        FlowManager flowManager = new FlowManager(
                () -> log.info("Faze 1"),
                () -> log.info("Vybuch")
        );
        flowManager.startFlow();
    }

}