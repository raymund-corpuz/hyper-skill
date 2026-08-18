package org.food.record;

import java.time.LocalDate;

public record OrderRecord(String customerName, String restaurantName, String food, double price, LocalDate date) {
}
