package cz.michalv.behavioral.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * This is a very important step and we should create the chain carefully, otherwise a processor might not be getting
 * any request at all. For example, in our implementation if we keep the first processor chain as Dollar10Dispenser
 * and then Dollar20Dispenser, then the request will never be forwarded to the second processor and the chain will
 * become useless. Here is our ATM Dispenser implementation to process the user requested amount.
 */
@Slf4j
public class ATMDispenseChain {

    private DispenseChain c1;

    public ATMDispenseChain() {
        // initialize the chain
        this.c1 = new Crowns500Dispenser();
        DispenseChain c2 = new Crowns200Dispenser();
        DispenseChain c3 = new Crowns100Dispenser();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        while (true) {
            int amount = 0;
            log.info("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 100 != 0) {
                log.info("Amount should be in multiple of 100s.");
                return;
            }
            // process the request
            atmDispenser.c1.dispense(new Currency(amount));
        }
    }
}
