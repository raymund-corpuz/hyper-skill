package org.simple.hotel.model;

import org.simple.hotel.interfaces.Displayable;

public class Room implements Displayable {
    private String roomNumber;
    private RoomType roomType;
    private double price;
    private boolean available;
    private RoomDetails roomDetails;

    public Room(String roomNumber, RoomType roomType, double price, boolean available, int floor, String view) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.available = available;
        this.roomDetails = new RoomDetails(floor, view);
    }

    public class RoomDetails {
        private int floor;
        private String view;

        public RoomDetails(int floor, String view) {
            this.floor = floor;
            this.view = view;
        }

        public void displayRoomDetails() {
            System.out.println("Room: " + roomNumber);
            System.out.println("Floor: " + floor);
            System.out.println("View: " + view);
        }

        public int getFloor() {
            return floor;
        }

        public void setFloor(int floor) {
            this.floor = floor;
        }

        public String getView() {
            return view;
        }

        public void setView(String view) {
            this.view = view;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println();
        System.out.println("Room: " + roomNumber);
        System.out.println("Type: " + roomType.name());
        System.out.println("Price: " + price);
        System.out.println("Available: " + (available ? "AVAILABLE ✅" : "NOT AVAILABLE ❌"));

    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
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

    public RoomDetails getRoomDetails() {
        return roomDetails;
    }

    public void setRoomDetails(RoomDetails roomDetails) {
        this.roomDetails = roomDetails;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
