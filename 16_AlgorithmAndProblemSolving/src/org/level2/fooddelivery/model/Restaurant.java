package org.level2.fooddelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String restaurantId;
    private String name;
    private String address;
    private String category;
    private double rating;

    private List<FoodItem> menu;

    public Restaurant(double rating, String category, String address, String name, String restaurantId) {
        this.rating = rating;
        this.category = category;
        this.address = address;
        this.name = name;
        this.restaurantId = restaurantId;
        this.menu = new ArrayList<>();
    }

    //add , remove, display, restaurant
    public void addFoodItem(FoodItem item) {
        menu.add(item);
    }

    public void removeFoodItem(FoodItem item) {
        menu.remove(item);
    }

    public void displayFoodItem() {
        if (menu.isEmpty()) {
            System.out.println("Menu is empty.❌");
            return;
        }
        for (FoodItem item : menu) {
            item.display();
        }
    }

    public void displayRestaurant() {
        System.out.println();
        System.out.println("===================================");
        System.out.println("            Restaurant");
        System.out.println("===================================");
        System.out.println();
        System.out.println("ID: " + restaurantId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Category: " + category);
        System.out.println("Rating: " + rating);
    }


    //-------------

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<FoodItem> getMenu() {
        return menu;
    }

    public void setMenu(List<FoodItem> menu) {
        this.menu = menu;
    }
}
