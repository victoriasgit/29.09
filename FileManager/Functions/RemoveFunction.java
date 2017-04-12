package FileManager.Functions;

import FileManager.Commands.DeleteFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by User on 09.04.2017.
 */
public class RemoveFunction implements DeleteFile{
    @Override
    public void delete(String pathToDirectory) {

        try {

            Files.delete(path);
        }
        catch (IOException ex) {
            System.err.println("RemoveException");
        }
    }
}

