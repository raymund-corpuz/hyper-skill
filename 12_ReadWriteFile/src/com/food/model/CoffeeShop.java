package com.food.model;

import com.food.interfaces.Displayable;

public class CoffeeShop extends Restaurant implements Displayable {
    private String drinkSize;

    public CoffeeShop(String id, String restaurantName, double deliveryFee, String drinkSize) {
        super(id, restaurantName, deliveryFee);
        this.drinkSize = drinkSize;
    }

    @Override
    public void displayInfo() {
        System.out.println();
        System.out.println("Category Type: FastFood");
        System.out.println("Restaurant ID: " + getId());
        System.out.println("Restaurant Name: " + getRestaurantName());
        System.out.println("Delivery Fee: " + getDeliveryFee());
        System.out.println("Drink Size: " + drinkSize);
    }

    public String getDrinkSize() {
        return drinkSize;
    }
}
