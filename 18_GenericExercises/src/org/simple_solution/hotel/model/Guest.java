package org.simple_solution.hotel.model;

public class Guest extends Person {

    private int numberOfBookings;

    public Guest(int id, String name, String email, String phone) {
        super(id, name, email, phone);
        this.numberOfBookings = 0;
    }

    @Override
    public void displayInfo() {
        System.out.println("--------------------------------");
        System.out.println("Guest ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println("Bookings: " + numberOfBookings);
    }

    public int getNumberOfBookings() {
        return numberOfBookings;
    }

    public void setNumberOfBookings(int numberOfBookings) {
        this.numberOfBookings = numberOfBookings;
    }

    public void incrementBooking() {
        this.numberOfBookings++;
    }

    public void decrementBooking() {
        if (numberOfBookings > 0) {
            numberOfBookings--;
        }
    }

    @Override
    public String toString() {
        return getId() + "|" + getName() + "|" + getEmail();
    }
}
