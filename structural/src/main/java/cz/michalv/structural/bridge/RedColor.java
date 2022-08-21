package cz.michalv.structural.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RedColor implements Colored {

    public void applyColor() {
        log.info("red.");
    }
}
