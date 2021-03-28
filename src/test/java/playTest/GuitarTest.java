package playTest;

import org.junit.Before;
import org.junit.Test;
import play.Guitar;
import play.InstrumentType;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Wood", InstrumentType.Strings, 20.00, 35.00, 7);
    }

    @Test
    public void hasNumberOfString(){
        assertEquals(7, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("playing: twang", guitar.play("twang"));
    }

    @Test
    public void canSell(){
        assertEquals(15.00, guitar.calculateMarkup(), 0.00);
    }
}
