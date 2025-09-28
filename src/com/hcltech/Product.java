package com.hcltech;

import java.util.*;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }

    // Dummy data
    public static List<Product> getDummyProducts() {
        return Arrays.asList(
                new Product("Laptop", 1200),
                new Product("Phone", 800),
                new Product("Tablet", 600),
                new Product("Monitor", 300),
                new Product("Smartwatch", 400)
        );
    }
}

