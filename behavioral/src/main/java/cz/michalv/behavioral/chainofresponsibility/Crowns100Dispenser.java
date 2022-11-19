package cz.michalv.behavioral.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * We need to create different processor classes that will implement the DispenseChain interface and provide
 * implementation of dispense methods. Since we are developing our system to work with three types of currency bills:
 * 100 Kc, 200Kc and 500 Kc, we will create three concrete implementations.
 */
@Slf4j
public class Crowns100Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }


    /**
     * You will notice that every implementation is trying to process the request and based on the amount,
     * it might process some or full part of it. If one of the chain not able to process it fully, it sends
     * the request to the next processor in chain to process the remaining request.
     * If the processor is not able to process anything, it just forwards the same request to the next chain.
     * @param cur
     */
    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 100){
            int num = cur.getAmount()/100;
            int remainder = cur.getAmount() % 100;
            log.info("Dispensing " + num + " 100 Kc note");
            if (remainder != 0) this.chain.dispense(new Currency(remainder));
        } else{
            this.chain.dispense(cur);
        }
    }

}
