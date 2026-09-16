package org.hotel_solution.model;

import org.hotel.enums.ReservationStatus;
import org.hotel_solution.interfaces.Displayable;

public class Reservation implements Displayable {
    private String id;
    private Guest guest;
    private Room room;
    private int nights;
    private ReservationStatus status;


    public Reservation(String id, Guest guest, Room room, int nights) {
        this.id = id;
        this.guest = guest;
        this.room = room;
        this.nights = nights;
        this.status = ReservationStatus.CONFIRMED;
    }

    public double calculateTotal() {
        return nights * room.getPrice();
    }

    public void cancel() {
        status = ReservationStatus.CANCELLED;

        room.setAvailable(true);
    }

    public void complete() {
        status = ReservationStatus.COMPLETED;

        room.setAvailable(true);
    }

    @Override
    public void display() {
        System.out.println("----------------------------");
        System.out.println("Reservation ID: " + id);
        System.out.println("Guest: " + guest.getName());
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Room Type: " + room.getRoomType());
        System.out.println("Status: " + status);
        System.out.println("----------------------------");
    }

    //INNER CLASS
    public class ReservationSummary {
        public void display() {
            System.out.println();
            System.out.println("==== Summary ====");
            System.out.println("Guest: " + guest.getName());
            System.out.println("Room: " + room.getRoomNumber());
            System.out.println("Nights: " + nights);
            System.out.println("Total: ₱" + calculateTotal());
            System.out.println("Status: " + status);
            System.out.println("=================");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
}
