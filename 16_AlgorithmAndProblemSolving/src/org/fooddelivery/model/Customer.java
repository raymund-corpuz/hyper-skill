package org.fooddelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private String email;
    private String address;

    private List<Order> orderList;


    //Constructor

    public Customer(String id, String name, String phone, String email, String address) {
        super(id, name, phone);
        this.email = email;
        this.address = address;
        this.orderList = new ArrayList<>();
    }

    @Override
    public void displayProfile() {
        System.out.println();
        System.out.println("========================================");
        System.out.println("            Customer Profile    ");
        System.out.println("========================================");
        System.out.println();
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhone());
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println();
        System.out.println("=========================================");
    }


    //add
    public void addOrder(Order orderItem) {
        orderList.add(orderItem);
    }

    //remove
    public void removeOrder(Order orderItem) {
        if (orderList.isEmpty()) {
            System.out.println("Order List is Empty.❌");
            return;
        }
        orderList.remove(orderItem);
    }

    //view
    public void viewOrder() {
        if (orderList.isEmpty()) {
            System.out.println("Order List is Empty.❌");
            return;
        }
        for (Order orderItem : orderList) {
            System.out.println(orderItem);
        }
    }

    //getters

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    //setters

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
