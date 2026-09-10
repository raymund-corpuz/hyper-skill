package org.level2.fooddelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private String email;
    private String address;

    private List<Order> orderList;

    public Customer(String id, String name, String phone, String email, String address) {
        super(id, name, phone);
        this.email = email;
        this.address = address;
        this.orderList = new ArrayList<>();
    }


    @Override
    public void displayProfile() {
        System.out.print("Customer ID: " + getId());
        System.out.print("Name: " + getName());
        System.out.print("Phone: " + getPhone());
        System.out.print("Address: " + address);
    }

    // add, view (added after checking)
    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void viewOrder() {
        if (orderList.isEmpty()) {
            System.out.println("Order is empty.❌");
            return;
        }

        for (Order order : orderList) {
            System.out.println(order);
        }
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

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
