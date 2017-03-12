package Player;

/**
 * Created by User on 08.03.2017.
 */
public interface DataInterface {

    void add(String title, int duration, String genre, String format, String name);
    void remove(String title, int duration, String genre, String format, String name);

}