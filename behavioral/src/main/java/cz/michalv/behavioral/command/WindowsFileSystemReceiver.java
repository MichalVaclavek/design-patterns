package cz.michalv.behavioral.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WindowsFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        log.info("Opening file in Windows OS");
    }

    @Override
    public void writeFile() {
        log.info("Writing file in Windows OS");
    }

    @Override
    public void closeFile() {
        log.info("Closing file in Windows OS");
    }
}
