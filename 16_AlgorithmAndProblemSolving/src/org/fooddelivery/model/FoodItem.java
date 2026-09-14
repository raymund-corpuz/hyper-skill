package org.fooddelivery.model;

import org.fooddelivery.interfaces.Displayable;
import org.fooddelivery.interfaces.Searchable;

public class FoodItem implements Displayable, Searchable {
    private String foodId;
    private String name;
    private String category;
    private double price;
    private boolean available;


    //Constructor
    public FoodItem(String foodId, String name, String category, double price, boolean available) {
        this.foodId = foodId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    @Override
    public boolean matches(String keyword) {
        return name.toLowerCase().contains(keyword.toLowerCase());
    }

    //Display Food
    @Override
    public void display() {
        String status = available ? "Available" : "Unavailable";

        System.out.println(foodId + " | " + category + " |  ₱" + price + " | " + status);
    }


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
