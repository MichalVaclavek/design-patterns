package cz.michalv.behavioral.templatemethod;

/**
 * Well, this code works even prior to Java 8, but now you can create the FlowManager using lambdas or method references,
 * which is much more convenient.
 */
public final class FlowManager {

    private final Runnable phase1; // functional interface
    private final Runnable phase2;

    public FlowManager(Runnable phase1, Runnable phase2) {
        this.phase1 = phase1;
        this.phase2 = phase2;
    }

    public void startFlow() {
        phase1.run();
        phase2.run();
    }

    public void phase1() {
        phase1.run();
    }

    public void phase2() {
        phase2.run();
    }
}
