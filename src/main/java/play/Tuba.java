package play;

public class Tuba extends Instruments{

    private int numberOfValves;



    public Tuba(String material, InstrumentType instrumentType, double costPrice, double sellingPrice, int numberOfValves) {
        super(material, instrumentType, costPrice, sellingPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play(String sound){
        return "playing: " + sound;
    }

    public double calculateMarkup(){
        return getSellingPrice() - getCostPrice();
    }
}
