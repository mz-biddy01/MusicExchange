package play;


import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instruments implements IPlay, ISell {

    private String material;
    private InstrumentType instrumentType;
    private double costPrice;
    private double sellingPrice;
    private String play;
    private double calculateMarkup;


    public Instruments(String material, InstrumentType instrumentType, double costPrice, double sellingPrice) {
        this.material = material;
        this.instrumentType = instrumentType;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
//        this.play = play;
//        this.calculateMarkup = calculateMarkup;
    }

    public String getMaterial() {
        return material;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

//    public String play(String sound) {
//        return sound;
//    }
//
//    public double calculateMarkup(double markup){
//        return markup;
//    }
}
