package cz.michalv.structural.composite;

/**
 * Composite pattern base component defines the common methods for leaf and composites.
 * We can create a class Shape with a method draw(String fillColor) to draw the shape with given color.
 */
public interface Shape {

    void draw(String fillColor);
}
