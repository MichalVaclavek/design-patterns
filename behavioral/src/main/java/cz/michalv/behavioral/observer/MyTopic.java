package cz.michalv.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of our topic.
 * Notice the use of synchronization in notifyObservers() method to make sure the notification is sent only to
 * the observers registered before the message is published to the topic.
 */
@Slf4j
public class MyTopic implements Subject {

    private final List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if (!observers.contains(obj)) observers.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal;
        // synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX) {
            if (!changed) {
                return;
            }
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (Observer observer : observersLocal) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    //method to post message to the topic
    public void postMessage(String msg) {
        log.info("Message Posted to Topic: " + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}
