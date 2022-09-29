package cz.michalv.behavioral.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StateTest {

    public static void main(String[] args) {
        Context context = new Context();

        FirstState firstState = FirstState.getInstance();
        SecondState secondState = SecondState.getInstance();
        ThirdState thirdState = ThirdState.getInstance();

        context.setCurrent(firstState);
        context.goNext();
        context.goNext();
        log.info("***********");

        context.setCurrent(secondState);
        context.goPrev();
        context.goNext();
        log.info("***********");

        context.setCurrent(thirdState);
        context.goPrev();
        context.goPrev();
        context.goPrev();
        log.info("***********");
    }
}
