package com.food.model;

import com.food.interfaces.Displayable;

import java.sql.SQLOutput;

public class FastFood extends Restaurant implements Displayable {
    private String cookingTime;

    public FastFood(String id, String restaurantName, double deliveryFee, String cookingTime) {
        super(id, restaurantName, deliveryFee);
        this.cookingTime = cookingTime;
    }

    @Override
    public void displayInfo() {
        System.out.println();
        System.out.println("Category Type: Fast Food");
        System.out.println("Restaurant ID: " + getId());
        System.out.println("Restaurant Name: " + getRestaurantName());
        System.out.println("Delivery Fee: " + getDeliveryFee());
        System.out.println("Cooking Time: " + cookingTime);
    }
}
