package org.simple_solution.hotel.model;

import org.simple_solution.hotel.interfaces.Bookable;
import org.simple_solution.hotel.interfaces.Displayable;

public class Booking implements Bookable, Displayable {

    private int bookingId;
    private Guest guest;
    private Room room;
    private String checkInDate;
    private String checkOutDate;
    private BookingStatus status;

    public Booking(int bookingId, Guest guest, Room room, String checkInDate, String checkOutDate) {
        this.bookingId = bookingId;
        this.guest = guest;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.status = BookingStatus.CONFIRMED;
    }


    @Override
    public void book() {
        room.setAvailable(false);
        this.status = BookingStatus.COMPLETED;
    }

    @Override
    public void cancel() {
        room.setAvailable(true);
        this.status = BookingStatus.CANCELLED;
    }

    @Override
    public void displayInfo() {
        System.out.println("--------------------------------");
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Guest: " + guest.getName());
        System.out.println("Room: " + room.getRoomNumber());
        System.out.println("Check-in: " + checkInDate);
        System.out.println("Check-out: " + checkOutDate);
        System.out.println("Status: " + status);
    }


    @Override
    public String toString() {
        return "Booking #" + bookingId
                + " | Guest: " + guest.getName()
                + " | Room: " + room.getRoomNumber()
                + " | Status: " + status;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }
}
