package playTest;

import org.junit.Before;
import org.junit.Test;
import play.InstrumentType;
import play.Piano;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Hard Wood", InstrumentType.Keyboards, 120.00, 150.00, 72);
    }

    @Test
    public void hasNumberOfKeys(){
        assertEquals(72, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("playing: vibration", piano.play("vibration"));
    }

    @Test
    public void canSell(){
        assertEquals(30.00, piano.calculateMarkup(), 0.00);
    }
}
