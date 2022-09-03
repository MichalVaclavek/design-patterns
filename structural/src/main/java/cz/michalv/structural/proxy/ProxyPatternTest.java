package cz.michalv.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * Proxy design pattern common uses are to control access or to provide a wrapper implementation for better performance.
 * Java RMI package uses proxy pattern. That’s all for proxy design pattern in java.
 */
@Slf4j
public class ProxyPatternTest {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            log.info("Exception Message::{}", e.getMessage());
        }
    }
}
