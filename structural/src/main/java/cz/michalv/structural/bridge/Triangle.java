package cz.michalv.structural.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Triangle extends Shape {

    public Triangle(Colored c) {
        super(c);
    }

    @Override
    public void applyColor() {
        log.info("Triangle filled with color ");
        color.applyColor();
    }
}
