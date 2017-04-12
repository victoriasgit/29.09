package FileManager.Commands;

import FileManager.FileManager;
import FileManager.Interfaces.Command;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by User on 03.04.2017.
 */
public class CopyFile implements Command {

    private String path;
    private File source;
    private File dest;

    public CopyFile(String path){
        this.path = path;
    }

    @Override
    public void execute(){
        File file = new File(path);
        try{
            Files.copy(source.toPath(), dest.toPath());
        }catch(IOException e){
            System.err.println("Can't copy file");
        }
    }

}