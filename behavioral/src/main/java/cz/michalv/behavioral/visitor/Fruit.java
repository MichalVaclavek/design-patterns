package cz.michalv.behavioral.visitor;

/**
 * Notice the implementation of accept() method in concrete classes, its calling visit() method of Visitor and passing itself as argument.
 * We have visit() method for different type of items in Visitor interface that will be implemented by concrete visitor class
 */
public class Fruit implements ItemElement {

    private final int pricePerKg;
    private final int weight;
    private final String name;

    public Fruit(int priceKg, int wt, String nm) {
        this.pricePerKg = priceKg;
        this.weight = wt;
        this.name = nm;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }


    public int getWeight() {
        return weight;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
