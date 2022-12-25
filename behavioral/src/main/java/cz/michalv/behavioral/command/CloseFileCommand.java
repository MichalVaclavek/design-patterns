package cz.michalv.behavioral.command;

/**
 *  Implementation for all the different types of action performed by the receiver.
 *  Each Command implementation will forward the request to the appropriate method of receiver.
 */
public class CloseFileCommand implements Command {

    private final FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}
