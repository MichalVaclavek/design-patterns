package cz.michalv.behavioral.mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * Concrete User classes to be used by client system.
 * send() method is using mediator to send the message to the users
 * and it has no idea how it will be handled by the mediator.
 */
@Slf4j
public class UserImpl extends User {

    public UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg){
        log.info(this.name + ": Sending Message=" + msg);
        mediator.sendMessage(msg, this);
    }
    @Override
    public void receive(String msg) {
        log.info(this.name + ": Received Message:" + msg);
    }

}
