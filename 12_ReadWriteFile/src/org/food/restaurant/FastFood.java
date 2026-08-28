package org.food.restaurant;

public class FastFood extends Restaurant implements Deliverable {
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

    @Override
    public void order() {
        System.out.println("==== Order Details ====");
        System.out.println("Restaurant Name: " + getRestaurantName());
        System.out.println("Delivery Fee: " + getDeliveryFee());
        System.out.println();
        System.out.println("Order Successfully.✅");
    }

    @Override
    public void cancel() {
        System.out.println("Order Canceled");
    }
}
