package org.simple.hotel.model;

import org.simple.hotel.interfaces.Displayable;
import org.simple.hotel.interfaces.Searchable;

public class Guest extends Person implements Displayable, Searchable {
    private int numberOfBookings;
    Searchable search = new Searchable() {
        @Override
        public boolean matches(String keyword) {
            return getName().matches(keyword) || getId().matches(keyword);
        }
    };

    public Guest(String id, String name, String email, String phone, int numberOfBookings) {
        super(id, name, email, phone);
        this.numberOfBookings = numberOfBookings;
    }

    @Override
    public void displayInfo() {
        System.out.println();
        System.out.println("ID: " + getId());
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
}
