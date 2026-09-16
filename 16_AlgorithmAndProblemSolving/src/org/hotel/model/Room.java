package org.hotel.model;

import org.fooddelivery.interfaces.Displayable;
import org.fooddelivery.interfaces.Searchable;

public class Room implements Displayable, Searchable {
    private String roomNumber;
    private String roomType;
    private double price;
    private boolean available;

    public Room(String roomNumber, String roomType, double price, boolean available) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.available = available;
    }

    @Override
    public void display() {
        System.out.println(roomNumber + " | " + roomType + " | " + price + " | " + (available ? "Available" : "Not Available"));
    }

    @Override
    public boolean matches(String keyword) {
        return roomNumber.equalsIgnoreCase(keyword) || roomType.equalsIgnoreCase(keyword);
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }


}
