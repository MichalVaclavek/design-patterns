package cz.michalv.behavioral.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThirdState extends State {

    private static ThirdState INSTANCE = new ThirdState();

    private ThirdState() {
    }

    public static ThirdState getInstance() {
        return INSTANCE;
    }

    @Override
    public void next(Context context) {
        context.setCurrent(FirstState.getInstance());
        log.info( "Third to First state transition" );
    }

    @Override
    public void previous(Context context) {
        context.setCurrent(SecondState.getInstance());
        log.info( "Third to Second state transition" );
    }
}
