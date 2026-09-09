package org.mini_projects.level2.fooddelivery.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Customer extends Person {
    private String email;
    private String address;
    private List<Order> orderHistory;

    public Customer(String id, String name, String phone, String email, String address, List<Order> orderHistory) {
        super(id, name, phone);
        this.email = email;
        this.address = address;
        this.orderHistory = new LinkedList<>();
    }

    //Place Order
    public void addOrder(Order order) {
        orderHistory.add(order);
    }

    //View Order
    public void viewOrderHistory() {
        if (orderHistory.isEmpty()) {
            System.out.println("No order history.");
            return;
        }

        for (Order order : orderHistory) {
            System.out.println(order);
        }
    }


    //Cancel Order

    //view profile
    @Override
    public void displayProfile() {
        System.out.println();
        System.out.println("=======================================");
        System.out.println("            Customer Profile");
        System.out.println("=======================================");

        System.out.println("Customer ID:" + getId());
        System.out.println("Name       :" + getId());
        System.out.println("Phone      :" + getId());
        System.out.println("Email      :" + getId());
        System.out.println("Address    :" + getId());
        System.out.println();
    }

    //getters & setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }
}
