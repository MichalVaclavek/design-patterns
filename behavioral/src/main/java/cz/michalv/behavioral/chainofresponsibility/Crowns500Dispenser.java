package cz.michalv.behavioral.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * We need to create different processor classes that will implement the DispenseChain interface and provide
 * implementation of dispense methods. Since we are developing our system to work with three types of currency bills:
 * 100 Kc, 200Kc and 500 Kc, we will create three concrete implementations.
 */
@Slf4j
public class Crowns500Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 500) {
            int num = cur.getAmount() / 500;
            int remainder = cur.getAmount() % 500;
            log.info("Dispensing " + num + " 500 Kc note");
            if (remainder != 0) this.chain.dispense(new Currency(remainder));
        } else {
            this.chain.dispense(cur);
        }
    }
}
