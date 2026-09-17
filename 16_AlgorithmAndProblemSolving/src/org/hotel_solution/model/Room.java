package org.hotel_solution.model;


import org.hotel_solution.interfaces.Displayable;
import org.hotel_solution.interfaces.Searchable;

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
        String status = available ? "Available" : " Occupied";

        System.out.println(roomNumber + " | " + roomType + " | ₱" + price + " | " + status);
    }

    @Override
    public boolean matches(String keyword) {
        return roomNumber.equalsIgnoreCase(keyword) || roomType.equalsIgnoreCase(keyword);
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {

        return roomNumber
                + " - "
                + roomType
                + " - ₱"
                + price;
    }
}
