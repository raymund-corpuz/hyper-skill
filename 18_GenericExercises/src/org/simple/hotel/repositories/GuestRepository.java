package org.simple.hotel.repositories;

import org.simple.hotel.model.Guest;

import java.util.ArrayList;
import java.util.List;

public class GuestRepository {
    List<Guest> guests = new ArrayList<>();

    public void addGuest(Guest guest) {
        System.out.println("Successfully added: " + guest.getName());
        guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        System.out.println("Successfully remove: " + guest.getName());
        guests.remove(guest);
    }

    public Guest findGuest(String id) {

        for (Guest guest : guests) {
            if (guest.getId().matches(id)) {
                return guest;
            }
        }
        System.out.println("Guest ID Not Found.❌");
        return null;
    }

    public List<Guest> getAllGuest() {

        if (guests.isEmpty()) {
            System.out.println("No guests found.");
            return null;
        }

        for (Guest guest : guests) {
            guest.displayInfo();
        }
        return guests;
    }


}
