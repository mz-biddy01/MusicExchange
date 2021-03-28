package playTest;

import org.junit.Before;
import org.junit.Test;
import play.Flute;
import play.InstrumentType;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before(){
        flute = new Flute("Wood", InstrumentType.Woodwind, 10.00, 20.00, 15);
    }

    @Test
    public void hasLength(){
        assertEquals(15, flute.getLength());
    }

    @Test
    public void canPlay(){
        assertEquals("playing: tootle-too", flute.play("tootle-too"));
    }

    @Test
    public void canSell(){
        assertEquals(10.00, flute.calculateMarkup(), 0.00);
    }
}
