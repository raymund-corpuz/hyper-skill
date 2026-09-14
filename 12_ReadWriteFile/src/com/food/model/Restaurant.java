package com.food.model;

public abstract class Restaurant {
    private String id;
    private String restaurantName;
    private double deliveryFee;


    public Restaurant(String id, String restaurantName, double deliveryFee) {
        this.id = id;
        this.restaurantName = restaurantName;

        this.deliveryFee = deliveryFee;
    }


    public String getId() {
        return id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }


    public double getDeliveryFee() {
        return deliveryFee;
    }
}
