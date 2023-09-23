package blit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductSorting {
    int id;
    String name;
    int price;
    String description;

    public ProductSorting(int id, String name, int price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Id: " + id + ". Product: " + name + ", $" + price + ". " + description + ".";
    }

    public static void main(String[] args) {
        List<ProductSorting> products = new ArrayList<>();
        products.add(new ProductSorting(5, "Mango", 7, "Golden mango"));
        products.add(new ProductSorting(8, "Apple", 2, "Crispy"));
        products.add(new ProductSorting(1, "Plum", 3, "mrs Plum"));
        products.add(new ProductSorting(6, "Grape", 5, "Cotton candy green grape"));

        for (ProductSorting product : products) {
            System.out.println(product);
        }

//        Collections.sort(products, Comparator.comparing(p -> p.id));
//        Collections.sort(products, Comparator.comparing(p -> p.name));
//        products.sort(Comparator.comparing(p -> p.name));

        Collections.sort(products, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });

        for (ProductSorting product : products) {
            System.out.println(product);
        }

        products.forEach(product -> System.out.println(product));
        products.forEach(System.out::println);

    }

}
