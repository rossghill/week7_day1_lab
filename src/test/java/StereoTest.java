import org.junit.Before;
import org.junit.Test;

public class StereoTest {

    Stereo stereo;

    @Before
    public void before() {
        stereo = new Stereo("Tandy S-1000");
    }

    @Test
    public void stereoHasName() {
        stereo.getName();
    }


//    @Test
//    public void stereoCanPlayCD() {
//        assertEquals();
//    }
}
