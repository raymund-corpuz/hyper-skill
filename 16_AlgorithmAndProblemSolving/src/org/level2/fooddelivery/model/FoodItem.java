package org.level2.fooddelivery.model;

public class FoodItem {
    private String foodId;
    private String name;
    private String category;
    private double price;
    private boolean available;

    public FoodItem(String foodId, String name, String category, double price, boolean available) {
        this.foodId = foodId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    public void display() {
        System.out.println("Food ID: " + foodId);
        System.out.println("Food Name: " + name);
        System.out.println("Food Category: " + category);
        System.out.println("Food Price: " + price);
        System.out.println("Available: " + (available ? " Available" : "Not Available"));
    }

    //-------------

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
