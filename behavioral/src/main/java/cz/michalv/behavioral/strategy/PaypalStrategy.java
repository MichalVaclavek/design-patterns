package cz.michalv.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pwd){
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(int amount) {
        log.info(amount + " paid using Paypal.");
    }

}
