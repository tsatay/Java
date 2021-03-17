import java.util.ArrayList;

public class TVEpisodes {
    private String title;
    private int episode_length;
    private String director;
    private ArrayList<String> cast;

    public TVEpisodes(String title, int episode_length, String director, ArrayList<String> cast) {
        this.title = title;
        this.episode_length = episode_length;
        this.director = director;
        this.cast = cast;
    }
    public TVEpisodes(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisode_length() {
        return episode_length;
    }

    public void setEpisode_length(int episode_length) {
        this.episode_length = episode_length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public void setCast(ArrayList<String> cast) {
        this.cast = cast;
    }
}
