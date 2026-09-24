package net.practice.hotel.model;


import net.practice.hotel.model.enums.RoomStatus;
import net.practice.hotel.model.enums.RoomType;

public class Room {
    private String roomNumber;
    private RoomType roomType;
    private double pricePerNight;
    private RoomStatus status;

    public Room(String roomNumber, RoomType roomType, double pricePerNight, RoomStatus status) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.status = status;
    }

    public void displayRoom() {
        System.out.println();
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price: " + pricePerNight);
        System.out.println("Status: " + status);
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

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }
}
