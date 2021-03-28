package aisle;

public class GuitarString extends Accessories{

    public GuitarString(String description, double costPrice, double sellingPrice) {
        super(description, costPrice, sellingPrice);
    }

    public double calculateMarkup(){
        return getSellingPrice() - getCostPrice();
    }
}
