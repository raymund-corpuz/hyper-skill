package org.hyperskill.hotel;

public class Hotel {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    private boolean isAvailable;

    private String guestName;
    private int nights;

    public Hotel(int roomNumber, String roomType, double pricePerNight, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isAvailable = isAvailable;
    }

    String displayRoomInfo() {
        return this.roomNumber + " - " + this.roomType + " - " + this.pricePerNight + " - " + (this.isAvailable ? "Available" : "Occupied");
    }

    void reserveRoom(String guestName, int nights) {
        if (this.isAvailable) {
            this.guestName = guestName;
            this.nights = nights;
            System.out.println("Reservation Successful✅");
        } else {
            System.out.println("Room Not Available❌");
        }
    }

    double calculateReservationCost() {
        return pricePerNight * nights;
    }

    //GETTERS
    String getGuestName() {
        return this.guestName;
    }

    int getRoomNumber() {
        return this.roomNumber;
    }

    String getRoomType() {
        return this.roomType;
    }

    double getPricePerNight() {
        return this.pricePerNight;
    }

    int getNights() {
        return this.nights;
    }

    boolean getIsAvailable() {
        return this.isAvailable;
    }

    //SETTERS
    void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    void setNights(int nights) {
        this.nights = nights;
    }
}
