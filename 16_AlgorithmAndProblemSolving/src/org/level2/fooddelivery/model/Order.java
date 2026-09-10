package org.level2.fooddelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private String customerName;
    private String restaurant;
    private List<OrderItem> orderItems;
    private String paymentMethod;
    private String status;

    public Order(String orderId, String customerName, String restaurant, List<OrderItem> orderItems, String paymentMethod, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.restaurant = restaurant;
        this.paymentMethod = paymentMethod;
        this.status = status;

        this.orderItems = new ArrayList<>();
    }


    //add , remove, calculateTotal, updateStatus, diplayOrder
    public void addOrder(OrderItem order) {
        orderItems.add(order);
    }

    public void removeOrder(OrderItem order) {
        orderItems.remove(order);
    }

    public void displayOrder() {
        System.out.println();
        if (orderItems.isEmpty()) {
            System.out.println("No order to display.");
            return;
        }
        for (OrderItem orderItem : orderItems) {
            orderItem.displayOrderItem();
        }
    }
}
