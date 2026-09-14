package org.fooddelivery.service;

import org.fooddelivery.enums.DeliveryStatus;
import org.fooddelivery.model.Delivery;
import org.fooddelivery.model.Order;

import java.util.ArrayList;
import java.util.List;

public class DeliveryService {
    private List<Delivery> deliveries;

    public DeliveryService(String id, String riderName, String phone, Order order, String address) {
        deliveries = new ArrayList<>();
    }

    public Delivery assignDelivery(String id, String riderName, String phone, Order order, String address) {
        Delivery delivery = new Delivery(id, riderName, phone, order, address);

        deliveries.add(delivery);
        return delivery;
    }

    public void updateStatus(Delivery delivery, DeliveryStatus status) {
        delivery.updateDeliveryStatus(status);
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void displayDeliveries() {
        if (deliveries.isEmpty()) {
            System.out.println("No Deliveries.❌");
            return;
        }

        for (Delivery delivery : deliveries) {
            delivery.displayProfile();
        }
    }
}
