package play;

public class Flute extends Instruments  {

    private int length;

    public Flute(String material, InstrumentType instrumentType, double costPrice, double sellingPrice, int length) {
        super(material, instrumentType, costPrice, sellingPrice);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public String play(String sound){
        return "playing: " + sound;
    }

    public double calculateMarkup(){
        return getSellingPrice() - getCostPrice();
    }


}
