package cz.michalv.behavioral.state;

public class Context {

    private State current;

    public void setCurrent(State state) {
        current = state;
    }

    public void goNext() {
        current.next(this);
    }

    public void goPrev() {
        current.previous(this);
    }
}
