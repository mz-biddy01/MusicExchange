package playTest;

import org.junit.Before;
import org.junit.Test;
import play.InstrumentType;
import play.Tuba;

import static org.junit.Assert.assertEquals;

public class TubaTest {

    Tuba tuba;

    @Before
    public void before(){
        tuba = new Tuba("Metal", InstrumentType.Brass, 50.00, 70.00, 6 );
    }

    @Test
    public void canPlay(){
        assertEquals("playing: buzz", tuba.play("buzz"));
    }

    @Test
    public void canSell(){
        assertEquals(20.00, tuba.calculateMarkup(), 0.00);
    }
}
