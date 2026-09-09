package org.mini_projects.level2.fooddelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String restaurantID;
    private String restaurantName;
    private String address;
    private String category;
    private double rating;
    private List<FoodItem> items;

    public Restaurant(String restaurantID, String restaurantName, String address, String category, double rating, List<FoodItem> items) {
        this.restaurantID = restaurantID;
        this.restaurantName = restaurantName;
        this.address = address;
        this.category = category;
        this.rating = rating;
        this.items = new ArrayList<>();

    }

    //getters & setters

    public String getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<FoodItem> getItems() {
        return items;
    }

    public void setItems(List<FoodItem> items) {
        this.items = items;
    }
}
