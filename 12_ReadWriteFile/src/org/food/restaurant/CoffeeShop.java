package org.food.restaurant;

public class CoffeeShop extends Restaurant implements Deliverable {
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
