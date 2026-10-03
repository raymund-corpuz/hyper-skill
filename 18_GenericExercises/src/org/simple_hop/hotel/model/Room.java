package org.simple_hop.hotel.model;


import org.simple_hop.hotel.enums.RoomType;
import org.simple_hop.hotel.interfaces.Displayable;
import org.simple_hop.hotel.interfaces.Searchable;

public class Room implements Displayable, Searchable {
    private int roomNumber;
    private RoomType roomType;
    private double price;
    private boolean available;

    public Room(int roomNumber, RoomType roomType, double price, boolean available) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.available = available;
    }

    @Override
    public void displayInfo() {
        System.out.println();
        System.out.println("==== Room Information ====");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price: " + price);
        System.out.println("Status: " + (available ? "Available" : "Occupied"));
        System.out.println("----------------------------------------------------");

    }

    @Override
    public boolean searchById(int id) {
        return roomNumber == id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
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

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomType=" + roomType +
                ", price=" + price +
                ", available=" + available +
                '}';
    }
}
