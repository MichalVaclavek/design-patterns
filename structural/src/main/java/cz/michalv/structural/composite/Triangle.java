package cz.michalv.structural.composite;

import lombok.extern.slf4j.Slf4j;

/**
 * Composite design pattern leaf implements base component and these are the building block for the composite.
 * We can create multiple leaf objects such as Triangle, Circle etc.
 */
@Slf4j
public class Triangle implements Shape {

    @Override
    public void draw(String fillColor) {
        log.info("Drawing Triangle with color " + fillColor);
    }
}
