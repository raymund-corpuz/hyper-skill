package org.mini_projects.level2.fooddelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private Customer customerName;
    private Restaurant restaurantName;
    private List<OrderItem> orderItems;
    private String paymentMethod;
    private String orderStatus;


    public Order(String orderId, Customer customerName, Restaurant restaurantName, String paymentMethod) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.restaurantName = restaurantName;
        this.paymentMethod = paymentMethod;
        this.orderStatus = "PENDING";

        this.orderItems = new ArrayList<>();

    }

    public void addItem(FoodItem foodItem, int quantity) {
        OrderItem orderItem = new OrderItem(foodItem, quantity);
    }

    //getters & setters

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomerName() {
        return customerName;
    }

    public void setCustomerName(Customer customerName) {
        this.customerName = customerName;
    }

    public Restaurant getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(Restaurant restaurantName) {
        this.restaurantName = restaurantName;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}
