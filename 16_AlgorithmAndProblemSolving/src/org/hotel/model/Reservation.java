package org.hotel.model;

import org.fooddelivery.interfaces.Displayable;
import org.hotel.enums.ReservationStatus;

import static org.hotel.enums.ReservationStatus.PENDING;

public class Reservation implements Displayable {
    private String reservationId;
    private Guest guest;
    private Room room;
    private int nights;
    private ReservationStatus status;

    public Reservation(String reservationId, Guest guest, Room room, int nights) {
        this.reservationId = reservationId;
        this.guest = guest;
        this.room = room;
        this.nights = nights;
        this.status = PENDING;
    }

    @Override
    public void display() {
        System.out.println("Reservation: ");
        System.out.println(reservationId);
        System.out.println("Guest: " + guest.getName());
        System.out.println("Room: " + room.getRoomNumber());
        System.out.println("Night: " + nights);
        System.out.println("Status: " + status);
    }

    public double calculateTotal() {
        return room.getPrice() * nights;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
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

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }


}
