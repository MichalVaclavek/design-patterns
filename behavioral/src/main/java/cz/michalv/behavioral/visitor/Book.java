package cz.michalv.behavioral.visitor;

/**
 * Notice the implementation of accept() method in concrete classes, its calling visit() method of Visitor and passing itself as argument.
 * We have visit() method for different type of items in Visitor interface that will be implemented by concrete visitor class
 */
public class Book implements ItemElement {

    private final int price;
    private final String isbnNumber;

    public Book(int cost, String isbn){
        this.price = cost;
        this.isbnNumber = isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
