package cz.michalv.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * Notice the implementation of update() method where it’s calling Subject getUpdate() method to get the message to consume.
 * We could have avoided this call by passing message as argument to update() method.
 */
@Slf4j
public class MyTopicSubscriber implements Observer {

    private final String name;
    private Subject topic;

    public MyTopicSubscriber(String nm) {
        this.name = nm;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        log.info(name + ((msg == null) ? ":: No new message" : ":: Consuming message::" + msg));
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic = sub;
    }
}
