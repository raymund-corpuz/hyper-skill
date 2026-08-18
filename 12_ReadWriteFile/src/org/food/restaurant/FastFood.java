package org.food.restaurant;

public class FastFood extends Restaurant {
    private String cookingTime;

    public FastFood(String restaurantName, double deliveryFee, String cookingTime) {
        super(restaurantName, deliveryFee);
        this.cookingTime = cookingTime;
    }

    //getters & setters

    public String getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(String cookingTime) {
        this.cookingTime = cookingTime;
    }
}
