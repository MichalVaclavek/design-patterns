package cz.michalv.behavioral.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost = 0;
        //apply 5$ discount if book price is greater than 50
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else {
            cost = book.getPrice();
        }
        log.info("Book ISBN::" + book.getIsbnNumber() + " cost = " + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        log.info(fruit.getName() + " cost = " + cost);
        return cost;
    }
}
