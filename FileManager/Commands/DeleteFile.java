package FileManager.Commands;

import java.io.File;

import FileManager.FileManager;
import FileManager.Interfaces.Command;

/**
 * Created by User on 03.04.2017.
 */
public class DeleteFile implements Command {

    private String path;

    public DeleteFile(String path){
        this.path = path;
    }

    @Override
    public void execute() {
        File file = new File(path);
        file.delete();
    }
}
