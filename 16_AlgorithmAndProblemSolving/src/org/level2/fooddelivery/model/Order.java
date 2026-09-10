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
        this.status = "PENDING";
        this.orderItems = new ArrayList<>();
    }


    //add , remove, calculateTotal, updateStatus, diplayOrder
    public void addItem(FoodItem foodItem, int quantity) {
        OrderItem orderItem = new OrderItem(foodItem, quantity);

        orderItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        orderItems.remove(orderItem);
    }

    public double calculateTotal() {
        double total = 0;

        for (OrderItem item : orderItems) {
            total += item.getSubTotal();
        }

        return total;
    }

    // ----------- getters

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
