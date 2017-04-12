package FileManager.Functions;

import java.io.IOException;
import java.net.HttpCookie;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

import static FileManager.PathContainer.path;

/**
 * Created by User on 09.04.2017.
 */
public class ChangeDirectoryFunction {

    private HttpCookie CurrentPathWrapper;

    @Override
    public Path changeDir(String pathToDirectory) {

        Path path = null;

        public void execute() {
            if (path.equals("~")) {
                CurrentPathWrapper.setPath(System.getProperty("user.home"));
                return;
            }

            File file = new File(path);

            if (file.isAbsolute()) {
                CurrentPathWrapper.setPath(path);
            }
            else {
                file = new File(CurrentPathWrapper.getPath() + "/" + path);
                if (file.exists())
                    CurrentPathWrapper.setPath(file.toPath().normalize().toString());
            }
        }
    }
}
