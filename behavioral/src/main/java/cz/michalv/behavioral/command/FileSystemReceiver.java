package cz.michalv.behavioral.command;

public interface FileSystemReceiver {

    void openFile();
    void writeFile();
    void closeFile();
}
