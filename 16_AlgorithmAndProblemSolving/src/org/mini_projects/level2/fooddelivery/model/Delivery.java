package org.mini_projects.level2.fooddelivery.model;

public class Delivery {
    private String deliveryId;
    private Order order;
    private String riderName;
    private String deliveryStatus;
    private String deliveryAddress;

    public Delivery(String deliveryId, Order order, String riderName, String deliveryStatus, String deliveryAddress) {
        this.deliveryId = deliveryId;
        this.order = order;
        this.riderName = riderName;
        this.deliveryStatus = deliveryStatus;
        this.deliveryAddress = deliveryAddress;
    }

    //getters & setters

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
