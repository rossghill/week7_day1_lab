import java.util.ArrayList;

public class CDPlayer extends Component{

    private int capacity;
    private ArrayList<String> playlist;

    public CDPlayer(String make, String model, int capacity){
        super(make, model);
        this.capacity = capacity;
        this.playlist = new ArrayList<>();
    }

    public void addToPlaylist(String album) {
        this.playlist.add(album);
    }
}
