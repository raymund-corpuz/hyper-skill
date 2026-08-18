package org.food.restaurant;

public abstract class Restaurant {
    private String restaurantName;
    private double deliveryFee;

    public Restaurant(String restaurantName, double deliveryFee) {
        this.restaurantName = restaurantName;
        this.deliveryFee = deliveryFee;

    }

    //Getters&  Setters

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }
}
