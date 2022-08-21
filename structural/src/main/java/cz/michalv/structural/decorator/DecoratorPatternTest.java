package cz.michalv.structural.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * https://www.digitalocean.com/community/tutorials/decorator-design-pattern-in-java-example
 *
 * Notice that client program can create different kinds of Object at runtime and they can specify the order of execution too.
 *
 * Decorator design pattern is helpful in providing runtime modification abilities and hence more flexible.
 * It's easy to maintain and extend when the number of choices are more.
 * The disadvantage of decorator design pattern is that it uses a lot of similar kind of objects (decorators).
 */
@Slf4j
public class DecoratorPatternTest {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        log.info("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}
