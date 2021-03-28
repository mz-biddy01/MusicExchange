package playTest;

import org.junit.Before;
import org.junit.Test;
import play.DrumKit;
import play.InstrumentType;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drumKit;

    @Before
    public  void before(){
        drumKit = new DrumKit("Steel", InstrumentType.Percussion, 20.00, 30.00, "Acoustic");
    }

    @Test
    public void hasKitType(){
        assertEquals("Acoustic", drumKit.getKitType());
    }

    @Test
    public void canPlay(){
        assertEquals("playing: da-dum-da-dum",drumKit.play("da-dum-da-dum"));
    }

    @Test
    public void canSell(){
        assertEquals(10.00, drumKit.calculateMarkup(), 0.00);
    }
}
