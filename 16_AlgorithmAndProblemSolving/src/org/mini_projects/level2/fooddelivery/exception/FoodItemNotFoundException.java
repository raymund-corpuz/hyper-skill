package org.mini_projects.level2.fooddelivery.exception;

public class FoodItemNotFoundException extends RuntimeException {
    public FoodItemNotFoundException(String message) {
        super(message);
    }
}
