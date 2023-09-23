package blit.assessments.week2;

import java.util.Set;
import java.util.TreeSet;

public class SuperMarket implements Comparable<SuperMarket> {
    public int productId;
    public String productName;
    public int row;
    public int price;


    public SuperMarket(int productId, String productName, int row, int price) {
        this.productId = productId;
        this.productName = productName;
        this.row = row;
        this.price = price;
    }


    public static void main(String[] args) {
        Set<SuperMarket> set = new TreeSet<>();
        set.add(new SuperMarket(103, "Maggie Ketchup", 2, 3));
        set.add(new SuperMarket(101, "Lays", 5, 2));
        set.add(new SuperMarket(102, "BiskFarm Biscuits", 3, 5));
        set.add(new SuperMarket(104, "Dairy Milk", 7, 10));
        set.add(new SuperMarket(105, "XYZ Soap", 1, 1));

        System.out.println(set);

    }

    @Override
    public int compareTo(SuperMarket sm) {
        return Integer.compare(productId, sm.productId);
    }

    @Override
    public String toString(){
        return productId + ", name: " + productName + ", row:" + row +", price is: " + price;
    }
}
