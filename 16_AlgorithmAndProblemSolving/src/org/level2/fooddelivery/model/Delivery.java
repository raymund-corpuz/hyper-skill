package org.level2.fooddelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Delivery extends Person {
    private List<Order> orders;
    private String deliveryAddress;
    private String deliveryStatus;

    public Delivery(String id, String name, String phone, String deliveryAddress, String deliveryStatus) {
        super(id, name, phone);
        this.deliveryAddress = deliveryAddress;
        this.deliveryStatus = deliveryStatus;

        this.orders = new ArrayList<>();
    }

    @Override
    public void displayProfile() {
        System.out.println();
        System.out.println("Delivery ID: " + getId());
        System.out.println("Delivery Name: " + getName());
        System.out.println("Delivery Phone: " + getPhone());
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Delivery Status: " + deliveryStatus);
    }
}
