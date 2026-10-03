package org.simple_hop.hotel.model;

import org.simple_hop.hotel.interfaces.Displayable;

public class Guest extends Person implements Displayable {

    private int nightsToStay;
    private int numberOfBookings;

    public Guest(int id, String name, String email, String phone, int nightsToStay) {
        super(id, name, email, phone);
        this.nightsToStay = nightsToStay;
        this.numberOfBookings = 0;
    }


    @Override
    public void displayInfo() {
        System.out.println();
        System.out.println("==== Guest Information ====");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println("Nights: " + nightsToStay);
        System.out.println("Number of Bookings: " + numberOfBookings);
        System.out.println("------------------------------------------");
    }

    public int incrementBooking() {
        this.numberOfBookings++;
        return numberOfBookings;
    }

    public int decrementBooking() {
        this.numberOfBookings--;
        return numberOfBookings;
    }

    public int getNightsToStay() {
        return nightsToStay;
    }

    public void setNightsToStay(int nightsToStay) {
        this.nightsToStay = nightsToStay;
    }

    public int getNumberOfBookings() {
        return numberOfBookings;
    }

    public void setNumberOfBookings(int numberOfBookings) {
        this.numberOfBookings = numberOfBookings;
    }
}
