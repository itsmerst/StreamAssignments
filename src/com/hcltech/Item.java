package com.hcltech;

import java.util.List;
import java.util.*;

public class Item {
    private String name;

    public Item(String name) { this.name = name; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return name;
    }
}
class Order {
    private List<Item> items;

    public Order(List<Item> items) { this.items = items; }
    public List<Item> getItems() { return items; }

    // Dummy data
    public static List<Order> getDummyOrders() {
        return Arrays.asList(
                new Order(Arrays.asList(new Item("Pen"), new Item("Notebook"))),
                new Order(Arrays.asList(new Item("Pencil"), new Item("Eraser"))),
                new Order(Arrays.asList(new Item("Ruler"), new Item("Marker")))
        );
    }
}
