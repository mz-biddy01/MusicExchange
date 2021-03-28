package alsleTest;

import aisle.GuitarString;
import org.junit.Before;
import org.junit.Test;
import play.Guitar;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString("Steel-string", 9.00, 15.00);
    }

    @Test
    public void hasDescription(){
        assertEquals("Steel-string", guitarString.getDescription());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(9.00, guitarString.getCostPrice(), 0.00);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(15.00, guitarString.getSellingPrice(), 0.00);
    }

    @Test
    public void hasMarkup(){
        assertEquals(6.00, guitarString.calculateMarkup(), 0.00);
    }
}
