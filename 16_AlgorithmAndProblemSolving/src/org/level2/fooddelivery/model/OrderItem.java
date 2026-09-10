package org.level2.fooddelivery.model;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private FoodItem foodItem;
    private int quantity;
    private double price;

    public OrderItem(FoodItem foodItem, int quantity) {
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.price = foodItem.getPrice();
    }


    public double getSubTotal() {
        return quantity * price;
    }

    //getters -----------------


    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
