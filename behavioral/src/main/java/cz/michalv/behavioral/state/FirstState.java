package cz.michalv.behavioral.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FirstState extends State {

    private static FirstState INSTANCE = new FirstState();

    private FirstState() {
    }

    @Override
    public void next(Context context) {
        context.setCurrent(SecondState.getInstance());
        log.info( "First to Second state transition" );
    }

    @Override
    public void previous(Context context) {
        context.setCurrent(ThirdState.getInstance());
        log.info( "First to Third state transition" );
    }

    public static FirstState getInstance() {
        return INSTANCE;
    }
}
