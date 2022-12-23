package cz.michalv.behavioral.observer;

/**
 *  Observer, there is a method to attach the Subject to the observer and another method to be used by Subject to notify of any change.
 */
public interface Observer {

    //method to update the observer, used by subject
    void update();

    //attach with subject to observe
    void setSubject(Subject sub);
}
