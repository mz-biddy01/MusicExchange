package alsleTest;

import aisle.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Pro-mark", 2.00, 8.00);
    }

    @Test
    public void hasDescription(){
        assertEquals("Pro-mark", drumSticks.getDescription());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(2.00, drumSticks.getCostPrice(), 0.00);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(8.00, drumSticks.getSellingPrice(), 0.00);
    }

    @Test
    public void hasMarkup(){
        assertEquals(6.00, drumSticks.calculateMarkup(), 0.00);
    }
}
