package play;

public class Piano extends Instruments{

    private  int numberOfKeys;

    public Piano(String material, InstrumentType instrumentType, double costPrice, double sellingPrice, int numberOfKeys) {
        super(material, instrumentType, costPrice, sellingPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(String sound){
        return "playing: " + sound;
    }

    public double calculateMarkup(){
        return getSellingPrice() - getCostPrice();
    }

}
