package cz.michalv.structural.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Circle implements Shape {

    @Override
    public void draw(String fillColor) {
        log.info("Drawing Circle with color " + fillColor);
    }
}
