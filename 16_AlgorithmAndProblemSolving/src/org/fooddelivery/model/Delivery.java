package org.fooddelivery.model;

import org.fooddelivery.enums.DeliveryStatus;
import org.fooddelivery.enums.OrderStatus;

import java.util.ArrayList;
import java.util.List;

public class Delivery extends Person {
    private Order order;
    private String deliveryAddress;
    private DeliveryStatus deliveryStatus;


    //Constructor

    public Delivery(String id, String name, String phone, Order order, String deliveryAddress) {
        super(id, name, phone);
        this.deliveryAddress = deliveryAddress;
        this.order = order;

        this.deliveryStatus = DeliveryStatus.ASSIGNED;
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

    public void updateDeliveryStatus(DeliveryStatus status) {
        this.deliveryStatus = status;

        switch (status) {
            case PICKED_UP:
                order.updateStatus(OrderStatus.READY);
                break;
            case ON_THE_WAY:
                order.updateStatus(OrderStatus.OUT_FOR_DELIVERY);
                break;
            case DELIVERED:
                order.updateStatus(OrderStatus.DELIVERED);
                break;
            case CANCELLED:
                order.updateStatus(OrderStatus.CANCELED);
                break;
            default:
                break;
        }

    }

    //getters


    public Order getOrder() {
        return order;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }
}
