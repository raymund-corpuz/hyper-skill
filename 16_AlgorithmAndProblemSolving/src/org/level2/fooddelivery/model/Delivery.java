package org.level2.fooddelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Delivery extends Person {
    private Order order;
    private String deliveryAddress;
    private String deliveryStatus;

    public Delivery(String id, String name, String phone, Order order, String deliveryAddress, String deliveryStatus) {
        super(id, name, phone);
        this.order = order;
        this.deliveryAddress = deliveryAddress;
        this.deliveryStatus = "ASSIGNED";


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

    // getters----------------------

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
