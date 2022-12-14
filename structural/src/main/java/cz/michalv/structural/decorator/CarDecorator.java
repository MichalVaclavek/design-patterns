package cz.michalv.structural.decorator;

/**
 * Decorator class implements the component interface and it has a HAS-A relationship with the component interface.
 * The component variable should be accessible to the child decorator classes, so we will make this variable protected.
 */
public abstract class CarDecorator implements Car {

    protected Car car;

    protected CarDecorator(Car c) {
        this.car=c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
