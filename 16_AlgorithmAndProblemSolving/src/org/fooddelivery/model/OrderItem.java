package org.fooddelivery.model;

public class OrderItem {
    private FoodItem foodItem;
    private int quantity;
    private double price;


    //Constructor

    public OrderItem(FoodItem foodItem, int quantity) {
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.price = foodItem.getPrice();
    }

    public double getSubTotal() {
        return price * quantity;
    }

    public void display() {
        System.out.println(foodItem.getName() + " x " + quantity + " = \u20B1" + getSubTotal());
    }
    //getter


    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
