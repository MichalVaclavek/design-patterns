package cz.michalv.behavioral.templatemethod;

import lombok.extern.slf4j.Slf4j;

/**
 * Konkretni implementace metod, ktery jsou volany v template metode v abstraktnim predkovi
 */
@Slf4j
public class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        log.info("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        log.info("Building Pillars with glass coating");
    }

}
