package cz.michalv.structural.flyweight;

import lombok.extern.slf4j.Slf4j;

import java.awt.*;

/**
 * The flyweight factory will be used by client programs to instantiate the Object, so we need to keep a map of Objects in the factory that should not be accessible by client application
 */
@Slf4j
public class Line implements Shape {

    public Line() {
        log.info("Creating Line object");
        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics line, int x1, int y1, int x2, int y2, Color color) {
        line.setColor(color);
        line.drawLine(x1, y1, x2, y2);
    }

}
