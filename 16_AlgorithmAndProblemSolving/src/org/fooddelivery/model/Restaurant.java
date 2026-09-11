package org.fooddelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String restaurantId;
    private String restaurantName;
    private String address;
    private String category;
    private double rating;
    private List<FoodItem> menu;


    //Constructor

    public Restaurant(String restaurantId, String restaurantName, String address, String category, double rating) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.address = address;
        this.category = category;
        this.rating = rating;
        this.menu = new ArrayList<>();
    }

    //Add
    public void addMenu(FoodItem foodItem) {
        menu.add(foodItem);
    }

    //View
    public void viewMenu() {
        if (menu.isEmpty()) {
            System.out.println("Menu is Empty.❌");
            return;
        }

        for (FoodItem foodItem : menu) {
            System.out.println(foodItem);
        }
    }

    //remove
    public void removeFoodItem(FoodItem foodItem) {
        menu.remove(foodItem);
    }

    //getter

    public String getRestaurantId() {
        return restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public String getCategory() {
        return category;
    }

    public double getRating() {
        return rating;
    }
}
