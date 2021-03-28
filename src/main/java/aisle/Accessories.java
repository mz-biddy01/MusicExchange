package aisle;

import behaviours.ISell;

public abstract class Accessories implements ISell {

    private String description;
    private double costPrice;
    private double sellingPrice;

    public Accessories(String description, double costPrice, double sellingPrice) {
        this.description = description;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
