package hyperskill.hotel.management.model;

import java.time.LocalDate;

public class Booking {
    private String bookingId;
    private Guest guest;
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;


    public Booking(String bookingId, Guest guest, Room room, LocalDate checkInDate, LocalDate checkOutDate) {
        this.bookingId = bookingId;
        this.guest = guest;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public void display() {
        System.out.println(bookingId);
        System.out.println("Guest: " + guest.getFirstName() + " " + guest.getLastName());
        System.out.println("Room: " + room.getRoomNumber());
        System.out.println("Check-in: " + checkInDate);
        System.out.println("Check-out: " + checkOutDate);
    }
    //getter

    public String getBookingId() {
        return bookingId;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }


}
