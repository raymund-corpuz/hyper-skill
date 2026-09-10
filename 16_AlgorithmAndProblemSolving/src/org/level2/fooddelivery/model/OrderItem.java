package org.level2.fooddelivery.model;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private List<FoodItem> foodItems;
    private int quantity;
    private double price;

    public OrderItem(List<FoodItem> foodItems, int quantity, double price) {
        this.foodItems = new ArrayList<>();
        this.quantity = quantity;
        this.price = price;
    }

    public double calculateSubtotal(FoodItem item, int quantity) {
        return item.getPrice() * quantity;
    }

    public void displayOrderItem() {
        for (FoodItem foodItem : foodItems) {
            foodItem.display();
        }
    }

}
