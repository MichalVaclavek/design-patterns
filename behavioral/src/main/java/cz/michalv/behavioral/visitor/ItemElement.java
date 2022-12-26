package cz.michalv.behavioral.visitor;

/**
 * To implement visitor pattern, first we will create different type of items (Elements) to be used in shopping cart.
 * Accept method takes Visitor argument. We can have some other methods also specific for items.
 */
public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);
}
