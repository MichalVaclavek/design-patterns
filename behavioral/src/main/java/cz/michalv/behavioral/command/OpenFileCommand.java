package cz.michalv.behavioral.command;

/**
 *  implementation for all the different types of action performed by the receiver.
 *  Each Command implementation will forward the request to the appropriate method of receiver.
 */
public class OpenFileCommand implements Command {

    private final FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        //open command is forwarding request to openFile method
        this.fileSystem.openFile();
    }
}
