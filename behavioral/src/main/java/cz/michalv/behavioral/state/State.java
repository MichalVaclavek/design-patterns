package cz.michalv.behavioral.state;

public abstract class State {

    public abstract void next(Context c);

    public abstract void previous(Context c);
}
