package play;

public class DrumKit extends Instruments {

    private String kitType;

    public DrumKit(String material, InstrumentType instrumentType, double costPrice, double sellingPrice, String kitType) {
        super(material, instrumentType, costPrice, sellingPrice);
        this.kitType = kitType;
    }

    public String getKitType() {
        return kitType;
    }

    public String play(String sound){
        return "playing: " + sound;
    }

    public double calculateMarkup(){
        return getSellingPrice() - getCostPrice();
    }
}
