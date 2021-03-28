package play;

public class Guitar extends Instruments {

    private int numberOfStrings;

    public Guitar(String material, InstrumentType instrumentType, double costPrice, double sellingPrice, int numberOfStrings) {
        super(material, instrumentType, costPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(String sound){
        return "playing: " + sound;
    }

    public double calculateMarkup(){
        return getSellingPrice() - getCostPrice();
    }
}
