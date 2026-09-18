package org.hotel_implementation.model;


import org.hotel_implementation.interfaces.Displayable;
import org.hotel_implementation.interfaces.Searchable;

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
        System.out.println(roomNumber + "|" + roomType + "|" + price + "|" + (available ? "Available" : "Occupied"));
    }

    @Override
    public boolean matches(String keyword) {
        return roomNumber.equalsIgnoreCase(keyword) || roomType.equalsIgnoreCase(keyword);
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
