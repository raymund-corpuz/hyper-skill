package org.food.restaurant;

public class CoffeeShop extends Restaurant {
    private String drinkSize;

    public CoffeeShop(String restaurantName, double deliveryFee, String drinkSize) {
        super(restaurantName, deliveryFee);
        this.drinkSize = drinkSize;
    }

    //getters & setters

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }
}
