import java.util.ArrayList;

public class Stereo {
    
    String name;
    ArrayList<Component> components;
    
    public Stereo(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
}
