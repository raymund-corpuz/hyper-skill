package org.fooddelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Delivery extends Person {
    private List<Order> orderList;
    private String deliveryAddress;
    private String deliveryStatus;


    //Constructor

    public Delivery(String id, String name, String phone, String deliveryAddress, String deliveryStatus) {
        super(id, name, phone);
        this.deliveryAddress = deliveryAddress;
        this.deliveryStatus = deliveryStatus;
        this.orderList = new ArrayList<>();
    }


    @Override
    public void displayProfile() {
        System.out.println();
        System.out.println("=======================================");
        System.out.println("            Delivery Profile");
        System.out.println("=======================================");
        System.out.println();
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhone());
        System.out.println("Address: " + deliveryAddress);
        System.out.println("Status: " + deliveryStatus);
        System.out.println();
        System.out.println("========================================");
    }

    public void updateDeliveryStatus(String status) {
        this.deliveryStatus = status;
    }

    //getters

    public List<Order> getOrderList() {
        return orderList;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }
}
