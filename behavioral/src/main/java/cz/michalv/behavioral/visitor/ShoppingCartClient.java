package cz.michalv.behavioral.visitor;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * https://www.digitalocean.com/community/tutorials/visitor-design-pattern-java
 *
 * The benefit of this pattern is that if the logic of operation changes, then we need to make change only in the visitor implementation rather than doing it in all the item classes.
 * Another benefit is that adding a new item to the system is easy, it will require change only in visitor interface and implementation and existing item classes will not be affected.
 *
 * The drawback of visitor pattern is that we should know the return type of visit() methods at the time of designing otherwise we will have to change the interface and all of its implementations.
 * Another drawback is that if there are too many implementations of visitor interface, it makes it hard to extend.
 */
@Slf4j
public class ShoppingCartClient {

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{ new Book(20, "1234"), new Book(100, "5678"),
                new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};

        int total = calculatePrice(items);
        log.info("Total Cost = " + total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        return  Arrays.stream(items).map(i -> i.accept(visitor)).reduce(0, Integer::sum);
    }
}
