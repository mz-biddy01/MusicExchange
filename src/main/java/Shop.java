import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public void addStock(ISell stock){
        this.stock.add(stock);
    }

    public void removeStock(ISell stock){
        this.stock.remove(stock);

    }

    public double totalMarkup() {
        double total = 0;
        for (ISell stock: this.stock) {
            total = total  + stock.calculateMarkup();
        }
        return total;

    }

//    public int getOccurrence(ISell stockItem){
//        int count = 0;
//        for (int i = 0; i < this.stock.size(); i++) {
//            ISell thisStock = this.stock.get(i);
//            if (stockItem.getClass().getSimpleName() == thisStock.getClass().getSimpleName()) {
//                count = count + 1;
//            }
//        }
//        for (ISell thisStock: this.stock) {
//            if (stockItem.getClass().getSimpleName() == thisStock.getClass().getSimpleName()) {
//                count = count + 1;
//            }
//        }
//        return count;
//    }

}
