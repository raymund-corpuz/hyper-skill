package org.simple_hop.hotel.model;

import org.simple_hop.hotel.enums.BookingStatus;
import org.simple_hop.hotel.interfaces.Displayable;

public class Booking implements Displayable {
    private int bookingId;
    private Guest guest;
    private Room room;
    private String checkIn;
    private String checkOut;
    private BookingStatus status;

    public Booking(int bookingId, Guest guest, Room room, String checkIn, String checkOut) {
        this.bookingId = bookingId;
        this.guest = guest;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.status = BookingStatus.CONFIRMED;
    }

    @Override
    public void displayInfo() {
        System.out.println();
        System.out.println("==== Booking Information ====");
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Guest: " + guest.getName());
        System.out.println("Room: " + room.getRoomNumber());
        System.out.println("Room Type: " + room.getRoomType());
        System.out.println("Check-in: " + checkIn);
        System.out.println("Check-out: " + checkOut);
        System.out.println("Status: " + status);
        System.out.println("------------------------------------------------");
    }

}
