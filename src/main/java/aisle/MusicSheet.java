package aisle;

public class MusicSheet extends Accessories {

    public MusicSheet(String description, double costPrice, double sellingPrice) {
        super(description, costPrice, sellingPrice);
    }

    public double calculateMarkup(){
        return getSellingPrice() - getCostPrice();
    }


}
