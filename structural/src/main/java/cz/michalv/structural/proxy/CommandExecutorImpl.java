package cz.michalv.structural.proxy;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) throws IOException {
        //some heavy implementation
        Runtime.getRuntime().exec(cmd);
    }
}
