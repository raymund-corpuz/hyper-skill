package hyperskill.hotel.management.model;

import hyperskill.hotel.management.model.enums.RoomStatus;

public class Room {
    private String roomNumber;
    private String roomType;
    private double pricePerNight;
    private RoomStatus status;


    public Room(String roomNumber, String roomType, double pricePerNight, RoomStatus status) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.status = status;
    }

    public void display() {
        System.out.println(roomNumber);
        System.out.println("Type: " + roomType);
        System.out.println("Price: $" + pricePerNight);
        System.out.println("Status: " + status);
    }


    //getter

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public RoomStatus getStatus() {
        return status;
    }

    //setter

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    //toString

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", roomType='" + roomType + '\'' +
                ", pricePerNight=" + pricePerNight +
                ", status=" + status +
                '}';
    }
}
