package OOPS.Examples.CinemaManagement;
import java.util.ArrayList;

public class Movie {

    private int ID;
    private String Name;
    private String Language;
    private String Genre;
    private int RunningTime;
    private String Starring;
    private String Rating;
    private ArrayList<Show> shows;

    public Movie() {
        shows = new ArrayList<>();
    }

    public int getID() {
        return  ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getRunningTime() {
        return RunningTime;
    }

    public void setRunningTime(int runningTime) {
        RunningTime = runningTime;
    }

    public String getStarring() {
        return Starring;
    }

    public void setStarring(String starring) {
        Starring = starring;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public ArrayList<Show> getShows() {
        return shows;
    }

    public void setShows(ArrayList<Show> shows) {
        this.shows = shows;
    }
}
