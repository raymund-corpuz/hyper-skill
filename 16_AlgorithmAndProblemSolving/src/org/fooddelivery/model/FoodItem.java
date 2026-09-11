package org.fooddelivery.model;

public class FoodItem {
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

    //Display Food
    public void displayFoodItem() {
        System.out.println();
        System.out.println("ID: " + foodId);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (available ? "Available" : "Not Available"));
    }


    public String getFoodId() {
        return foodId;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }
}
