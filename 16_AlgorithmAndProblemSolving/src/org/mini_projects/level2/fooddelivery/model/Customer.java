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


    //View Order


    //Cancel Order

    //view profile
    @Override
    public void displayProfile() {
        System.out.println("Customer ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhone());
    }
}
