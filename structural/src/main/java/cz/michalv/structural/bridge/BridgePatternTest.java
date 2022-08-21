package cz.michalv.structural.bridge;

/**
 * https://www.digitalocean.com/community/tutorials/bridge-design-pattern-java
 *
 * Bridge design pattern can be used when both abstraction and implementation can have different hierarchies
 * independently and we want to hide the implementation from the client application.
 */
public class BridgePatternTest {

    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
