package org.fooddelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> orderItemList;
    private String customer;
    private String restaurant;
    private String paymentMethod;
    private String status;

    //Constructor

    public Order(String customer, String restaurant, String paymentMethod, String status) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.paymentMethod = paymentMethod;
        this.status = "PENDING";
        this.orderItemList = new ArrayList<>();
    }

    //add
    public void addOrderItem(FoodItem foodItem, int quantity) {
        OrderItem orderItem = new OrderItem(foodItem, quantity);

        orderItemList.add(orderItem);
    }

    //remove
    public void removerOrderItem(OrderItem orderItem) {
        if (orderItemList.isEmpty()) {
            System.out.println("Order List is Empty.❌");
            return;
        }
        orderItemList.remove(orderItem);
    }


    //getter

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public String getCustomer() {
        return customer;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getStatus() {
        return status;
    }
}
