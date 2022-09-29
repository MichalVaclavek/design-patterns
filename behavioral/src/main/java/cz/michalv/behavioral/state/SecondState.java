package cz.michalv.behavioral.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class SecondState extends State {

    private static SecondState INSTANCE = new SecondState();

    private SecondState() {}

    @Override
    public void next(Context context) {
        context.setCurrent(ThirdState.getInstance());
        log.info( "Second to Third state transition" );
    }

    @Override
    public void previous(Context context) {
        context.setCurrent(FirstState.getInstance());
        log.info( "Second to First state transition" );
    }

    public static SecondState getInstance() {
        return INSTANCE;
    }
}
