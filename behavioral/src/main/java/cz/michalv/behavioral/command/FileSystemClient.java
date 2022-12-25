package cz.michalv.behavioral.command;

/**
 * Client is responsible to create the appropriate type of command object.
 * For example if you want to write a file you are not supposed to create CloseFileCommand object.
 * Client program is also responsible to attach receiver to the command and then command to the invoker class.
 *
 * https://www.digitalocean.com/community/tutorials/command-design-pattern
 */
public class FileSystemClient {

    public static void main(String[] args) {

        // Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        // creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        // Creating invoker and associating with Command

        FileInvoker file = new FileInvoker(openFileCommand);

        // perform action on invoker object
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
