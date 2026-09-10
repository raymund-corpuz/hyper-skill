package org.level2.fooddelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private String email;
    private String address;

    private List<Order> orders;

    public Customer(String id, String name, String phone, String email, String address) {
        super(id, name, phone);
        this.email = email;
        this.address = address;
        this.orders = new ArrayList<>();
    }


    @Override
    public void displayProfile() {
        System.out.print("Customer ID: " + getId());
        System.out.print("Name: " + getName());
        System.out.print("Phone: " + getPhone());
        System.out.print("Address: " + address);
    }

    //----------

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

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
