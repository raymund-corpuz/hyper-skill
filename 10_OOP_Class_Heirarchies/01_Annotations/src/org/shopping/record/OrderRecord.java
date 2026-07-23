package org.shopping.record;

public record OrderRecord(String customerName, String productName, int quantity, double totalPrice, String orderDate) {
}
