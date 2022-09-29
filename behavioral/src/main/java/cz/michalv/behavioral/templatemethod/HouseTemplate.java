package cz.michalv.behavioral.templatemethod;

import lombok.extern.slf4j.Slf4j;

/**
 * Template method defines the steps to execute an algorithm and it can provide default implementation that might be
 * common for all or some of the subclasses.
 * Pomoci interfacu se dela trochu sloziteji, musi ...
 */
@Slf4j
public abstract class HouseTemplate {

    //template method, final so subclasses can't override
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        log.info("House is built.");
    }

    //default implementation
    private void buildWindows() {
        log.info("Building Glass Windows");
    }

    //methods to be implemented by subclasses
    public abstract void buildWalls();
    public abstract void buildPillars();

    private void buildFoundation() {
        log.info("Building foundation with cement,iron rods and sand");
    }
}
