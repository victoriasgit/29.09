package Player;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by User on 08.03.2017.
 */
public class DataActions implements DataInterface{

    private Track track;
    private List<Track> trackList;
    private Performer performer;
    private List<Performer> performerList;

    public DataActions(){

        this.trackList = new ArrayList<>();
        this.performerList = new ArrayList<>();

    }

    @Override
    public void add(String title, int duration, String genre, String format, String name){
        if(this.performerList.getName().equals(name) && this.trackList.getTitle().equals(title) &&
                this.trackList.getDuration() == duration && this.trackList.getGenre().equals(genre) &&
                this.trackList.getFormat().equals(format) ){
                    System.out.println("This file exists");
        }
        else {
            this.trackList.add(new Track(title, format, duration, genre));
            this.performerList.add(new Performer(name));
        }
    }

    @Override
    public void remove(String title, int duration, String genre, String format, String name){
        if(this.performerList.getName().equals(name) && this.trackList.getTitle().equals(title) &&
                this.trackList.getDuration() == duration && this.trackList.getGenre().equals(genre) &&
                    this.trackList.getFormat().equals(format) ){
                        this.track = new Track(title, format, duration, genre);
                        this.trackList.remove(this.track);
        }
        else{
            System.out.println("There isn't this track");
        }
    }
}
