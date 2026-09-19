package org.hotel_implementation.model;


import org.hotel_implementation.enums.ReservationStatus;

public class Reservation {
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
        return room.getPrice() * nights;
    }

    public class ReservationSummary {
        public void display() {
            System.out.println("=============================");
            System.out.println("==== Reservation Summary ====");
            System.out.println("=============================");
            System.out.println();
            System.out.println("Reservation: " + id);
            System.out.println("Guest: " + guest.getName());
            System.out.println("Room: " + room.getRoomNumber());
            System.out.println("Nights: " + nights);
            System.out.println("Status: " + status);
            System.out.println("Total: " + calculateTotal());
            System.out.println("=============================");
        }
    }

    public void cancel() {
        this.status = ReservationStatus.CANCELLED;
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
