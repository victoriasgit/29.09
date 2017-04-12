package FileManager.Functions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

/**
 * Created by User on 09.04.2017.
 */
public class MoveFunction {
    @Override
    public void moveTo(String src, String dest) {

        Path source = null;
        Path destination = null;

        try {
            source = Paths.get(src).toRealPath();
            destination = Paths.get(dest).toRealPath();
        } catch (IOException ex) {
            System.err.println("MoveFunctionException");
        }

    }
}
