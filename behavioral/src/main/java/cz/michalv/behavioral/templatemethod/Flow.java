package cz.michalv.behavioral.templatemethod;

/**
 * Jde o Java 8+ reseni.
 * You can also combine the approaches: define the interface and provide a way to construct it from lambdas
 */
public interface Flow {

    void phase1();
    void phase2();

    static Flow of(Runnable phase1, Runnable phase2) {
        return new Flow() {
            @Override
            public void phase1() {
                phase1.run();
            }

            @Override
            public void phase2() {
                phase2.run();
            }
        };
    }
}
