package FileManager.Commands;

import FileManager.FileManager;
import FileManager.Functions.ChangeDirectoryFunction;
import FileManager.Interfaces.ChangeDirectory;

import java.nio.file.Path;

/**
 * Created by User on 08.04.2017.
 */
public class ChangeDirectoryCommand implements ChangeDirectory{

    private final ChangeDirectoryFunction cd;

    public ChangeDirectoryCommand(ChangeDirectoryFunction cd){
        this.cd = cd;
    }

    @Override
    public Path execute(String path) {
        return this.cd.changeDir(path);
    }
}
