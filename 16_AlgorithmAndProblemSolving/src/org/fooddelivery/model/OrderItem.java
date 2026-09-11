package org.fooddelivery.model;

public class OrderItem {
    private FoodItem foodItem;
    private int quantity;


    //Constructor

    public OrderItem(FoodItem foodItem, int quantity) {
        this.foodItem = foodItem;
        this.quantity = quantity;
    }

    public double getSubTotal() {
        return quantity * foodItem.getPrice();
    }

    //getter

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public int getQuantity() {
        return quantity;
    }
}
