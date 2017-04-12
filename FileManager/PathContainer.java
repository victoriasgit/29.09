package FileManager;


/**
 * Created by User on 05.04.2017.
 */
public class PathContainer {

    public static int path;
    private static String currentPath = System.getProperty("user.home");

    private static String get() {
        return currentPath;
    }

    public void set(String path) {
        currentPath = path;
    }

}
