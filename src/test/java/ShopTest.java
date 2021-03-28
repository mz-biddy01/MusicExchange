import aisle.DrumSticks;
import aisle.GuitarString;
import aisle.MusicSheet;
import org.junit.Before;
import org.junit.Test;
import play.*;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private DrumKit drumKit;
    private Flute flute;
    private Guitar guitar;
    private Piano piano;
    private Tuba tuba;
    private MusicSheet musicSheet;
    private GuitarString guitarString;
    private DrumSticks drumSticks;
    private DrumKit drumKit1;
    private DrumSticks drumSticks1;

    @Before
    public void before(){
        shop = new Shop();
        drumKit = new DrumKit("Steel", InstrumentType.Percussion, 20.00, 30.00, "Acoustic");
        flute = new Flute("Wood", InstrumentType.Woodwind, 10.00, 20.00, 15);
        guitar = new Guitar("Wood", InstrumentType.Strings, 20.00, 35.00, 7);
        piano = new Piano("Hard Wood", InstrumentType.Keyboards, 120.00, 150.00, 72);
        tuba = new Tuba("Metal", InstrumentType.Brass, 50.00, 70.00, 6 );
        musicSheet = new MusicSheet("Printed", 5.00, 10.00);
        guitarString = new GuitarString("Steel-string", 9.00, 15.00);
        drumSticks = new DrumSticks("Pro-mark", 2.00, 8.00);

    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.getStockCount());
    }

//    @Test
//    public void canAddDrumKitToStock(){
//        shop.addStock(drumKit);
//        shop.addStock(drumKit1);
//        assertEquals(2, shop.getStockCount());
//    }
//
//    @Test
//    public void canAddFluteToStock(){
//        shop.addStock(flute);
//        assertEquals(1, shop.getStockCount());
//    }
//
//    @Test
//    public void canAddGuitarToStock(){
//        shop.addStock(guitar);
//        assertEquals(1, shop.getStockCount());
//    }

    @Test
    public void canAddItemsToStock(){
        shop.addStock(drumKit);
        shop.addStock(drumKit1);
        shop.addStock(flute);
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(tuba);
        shop.addStock(drumSticks);
        shop.addStock(drumSticks1);
        shop.addStock(guitarString);
        shop.addStock(musicSheet);
        assertEquals(10, shop.getStockCount());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addStock(drumKit);
        shop.addStock(drumKit1);
        shop.addStock(flute);
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(tuba);
        shop.addStock(drumSticks);
        shop.addStock(drumSticks1);
        shop.addStock(guitarString);
        shop.addStock(musicSheet);
        shop.removeStock(drumKit1);
        assertEquals(9, shop.getStockCount());
    }

    @Test
    public void calculateTotalMarkUp(){
        shop.addStock(drumKit);
        shop.addStock(guitarString);
        shop.addStock(guitar);
//        assertEquals(10.00, drumKit.calculateMarkup(10.00), 0.00);
        assertEquals(31.00, shop.totalMarkup(), 0.00);

    }

//    @Test
//    public void checkNumberOfOccurrence(){
//        shop.addStock(drumKit);
//        shop.addStock(drumKit1);
//        shop.addStock(flute);
//        shop.addStock(guitar);
//        shop.addStock(piano);
//        shop.addStock(tuba);
//        shop.addStock(drumSticks);
//        shop.addStock(drumSticks1);
//        shop.addStock(guitarString);
//        shop.addStock(musicSheet);
//        assertEquals(1, shop.getOccurrence(flute));
//    }

}
