package org.hotel.model;

import org.hotel.enums.ReservationStatus;
import org.hotel.interfaces.Displyable;
import org.hotel.interfaces.Searchable;

import java.util.List;

public class Reservation implements Displyable {
    private String id;
    private Guest guest;
    private Room rooms;
    private int nights;
    private ReservationStatus status;

    public Reservation(String id, Guest guest, Room rooms, int nights) {
        this.id = id;
        this.guest = guest;
        this.rooms = rooms;
        this.nights = nights;
        this.status = ReservationStatus.PENDING;
    }

    //calcuateTotal()
    public double calculateTotal() {
        return nights * rooms.getPrice();
    }


    @Override
    public void display() {
        System.out.println(id + "|" + guest.getName() + "|" + rooms.getRoomNumber() + "|" + nights + "| $" + calculateTotal());
    }


    public String getId() {
        return id;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRooms() {
        return rooms;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
}
