import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComponentTest {


    CDPlayer cdPlayer;
    CassetteDeck cassetteDeck;
    Radio radio;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "Walkman", 8);
        cassetteDeck = new CassetteDeck("Mitzibishi", "Tiger","The Beatles");
        radio = new Radio();
    }

    @Test
    public void canPlay(){
        assertEquals("Now Playing", cdPlayer.play());
        assertEquals("Now Playing", cassetteDeck.play());
//        assertEquals("Now Playing", radio.play());
    }

    @Test
    public void canAddCD() {
        assertEquals(1, cdPlayer.capacity.size());
    }
}
