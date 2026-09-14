package org.fooddelivery.record;

public record OrderRecord(String orderId, String customerName, String restaurantName, double total, String status) {
}
