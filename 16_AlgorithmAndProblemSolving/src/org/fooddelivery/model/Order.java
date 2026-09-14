package org.fooddelivery.model;

import org.fooddelivery.enums.OrderStatus;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private Customer customer;
    private Restaurant restaurant;
    private List<OrderItem> orderItems;
    private String paymentMethod;
    private OrderStatus status;

    //Constructor

    public Order(String orderId, Customer customer, Restaurant restaurant, String paymentMethod) {
        this.orderId = orderId;
        this.customer = customer;
        this.restaurant = restaurant;
        this.paymentMethod = paymentMethod;

        this.status = OrderStatus.PENDING;
        this.orderItems = new ArrayList<>();
    }

    public void addItem(FoodItem fooditem, int quantity) {
        OrderItem orderItem = new OrderItem(fooditem, quantity);

        orderItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        orderItems.remove(orderItem);
    }

    public double calculateTotal() {
        double total = 0;

        for (OrderItem orderItem : orderItems) {
            total += orderItem.getSubTotal();
        }
        return total;
    }

    public void updateStatus(OrderStatus status) {
        this.status = status;
    }
    /*
     * INNER CLASS
     *
     * This class exists only as a helper
     * for displaying an Order summary.
     */

    public class OrderSummary {
        public void display() {
            System.out.println("==================================");
            System.out.println("              Order Summary ");
            System.out.println("==================================");
            System.out.println("Order ID: " + orderId);
            System.out.println("Customer: " + customer.getName());
            System.out.println("Restaurant: " + restaurant.getRestaurantName());
            System.out.println("Payment: " + paymentMethod);
            System.out.println("Status: " + status);
            System.out.println("Total:  \u20B1" + calculateTotal());
            System.out.println("==================================");
        }
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
