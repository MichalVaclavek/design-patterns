package cz.michalv.behavioral.command;

/**
 * Invoker is a simple class that encapsulates the Command and passes the request to the command object to process it.
 */
public class FileInvoker {

    private final Command command;

    public FileInvoker(Command c) {
        this.command = c;
    }

    public void execute() {
        this.command.execute();
    }
}
