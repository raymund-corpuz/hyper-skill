package org.fooddelivery.model;

import org.fooddelivery.interfaces.Displayable;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Displayable {
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

    @Override
    public void display() {
        System.out.println("==================================");
        System.out.println("            Restaurant");
        System.out.println("==================================");
        System.out.println();
        System.out.println("ID          : " + restaurantId);
        System.out.println("Name        : " + restaurantName);
        System.out.println("Address     : " + address);
        System.out.println("Category    : " + category);
        System.out.println("Rating      : " + rating);
    }

    //Add
    public void addFoodItem(FoodItem foodItem) {
        menu.add(foodItem);
    }

    //View
    public void displayMenu() {
        if (menu.isEmpty()) {
            System.out.println("No food items available");
            return;
        }

        for (FoodItem foodItem : menu) {
            foodItem.display();
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
