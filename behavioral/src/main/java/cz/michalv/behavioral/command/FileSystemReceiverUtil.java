package cz.michalv.behavioral.command;

import lombok.extern.slf4j.Slf4j;

/**
 * Utility method to create the appropriate FileSystemReceiver object.
 */
@Slf4j
public class FileSystemReceiverUtil {

    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        log.info("Underlying OS is: " + osName);
        return osName.contains("Windows") ?  new WindowsFileSystemReceiver() : new UnixFileSystemReceiver();
    }
}
