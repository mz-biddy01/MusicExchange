package aisle;

public class DrumSticks extends Accessories{

    public DrumSticks(String description, double costPrice, double sellingPrice) {
        super(description, costPrice, sellingPrice);
    }

    public double calculateMarkup(){
        return getSellingPrice() - getCostPrice();
    }
}
