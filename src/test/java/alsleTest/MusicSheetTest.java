package alsleTest;

import aisle.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSheetTest {

    MusicSheet musicSheet;

    @Before
    public void before(){
        musicSheet = new MusicSheet("Printed", 5.00, 10.00);
    }

    @Test
    public void hasDescription(){
        assertEquals("Printed", musicSheet.getDescription());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(5.00, musicSheet.getCostPrice(), 0.00);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(10.00, musicSheet.getSellingPrice(), 0.00);
    }

    @Test
    public void hasMarkup(){
        assertEquals(5.00, musicSheet.calculateMarkup(), 0.00);
    }
}
