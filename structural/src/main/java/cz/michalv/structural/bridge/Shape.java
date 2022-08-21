package cz.michalv.structural.bridge;

public abstract class Shape {

    //Composition - implementor, bridge to another objects implementing the interface
    protected Colored color;

    //constructor with implementor as input argument
    protected Shape(Colored c) {
        this.color=c;
    }

    public abstract void applyColor();
}
