package org.mini_projects.level2.fooddelivery.model;

import java.util.List;

public class OrderItem {
    private List<FoodItem> foodItem;
    private int quantity;
    private double price;
    private double subTotal;

    public OrderItem(List<FoodItem> foodItem, int quantity, double price, double subTotal) {
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.price = price;
        this.subTotal = subTotal;
    }

    //getters & setters


    public List<FoodItem> getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(List<FoodItem> foodItem) {
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

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}
