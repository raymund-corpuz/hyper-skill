package org.simple_solution.hotel.model;

import org.simple.hotel.model.RoomType;
import org.simple_solution.hotel.interfaces.Displayable;

public class Room implements Displayable {

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

    public class RoomDetails {

        private int floor;
        private String view;

        public RoomDetails(int floor, String view) {
            this.floor = floor;
            this.view = view;
        }

        public void displayDetails() {
            System.out.println();
            System.out.println("Room Number: " + roomNumber);
            System.out.println("Floor: " + floor);
            System.out.println("View: " + view);
        }
    }

    @Override
    public void displayInfo() {
        String status = available ? "Available" : "Not Available";

        System.out.println("--------------------------------");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price: PHP " + price);
        System.out.println("Status: " + status);
    }

    @Override
    public String toString() {
        return roomNumber + " - " + roomType + " - PHP " + price;
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
}
