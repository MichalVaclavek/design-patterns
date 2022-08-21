package cz.michalv.structural.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Pentagon extends Shape {

    public Pentagon(Colored c) {
        super(c);
    }

    @Override
    public void applyColor() {
        log.info("Pentagon filled with color ");
        color.applyColor();
    }
}
