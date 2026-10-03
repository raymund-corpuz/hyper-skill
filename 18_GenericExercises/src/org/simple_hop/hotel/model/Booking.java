package org.simple_hop.hotel.model;

import org.simple_hop.hotel.enums.BookingStatus;
import org.simple_hop.hotel.interfaces.Bookable;
import org.simple_hop.hotel.interfaces.Displayable;

public class Booking implements Displayable, Bookable {
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
    public void book() {
        room.setAvailable(false);
        guest.incrementBooking();
    }

    @Override
    public void cancel() {
        room.setAvailable(true);
        guest.decrementBooking();
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

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }


}




