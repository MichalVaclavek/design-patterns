package cz.michalv.behavioral.observer;

/**
 * Subject interface that defines the contract methods to be implemented by any concrete subject
 */
public interface Subject {

    //methods to register and unregister observers
    void register(Observer obj);
    void unregister(Observer obj);

    //method to notify observers of change
    void notifyObservers();

    //method to get updates from subject
    Object getUpdate(Observer obj);
}
