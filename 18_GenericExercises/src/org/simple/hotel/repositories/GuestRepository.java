package org.simple.hotel.repositories;

import org.simple.hotel.model.Guest;

import java.util.*;

public class GuestRepository {
    List<Guest> guests = new ArrayList<>();
    Set<String> guestEmailSet = new HashSet<>();
    LinkedHashSet<String> guestNameHash = new LinkedHashSet<>();

    public void addGuest(Guest guest) {
        System.out.println();

        if (guestEmailSet.contains(guest.getEmail())) {
            System.out.println("Email address is already registered: " + guest.getEmail());
            return;
        }

        System.out.println("Successfully added: " + guest.getName());
        guestEmailSet.add(guest.getEmail());
        guestNameHash.addLast(guest.getName());
        guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        Guest foundGuest = findGuest(guest.getId());
        System.out.println("Successfully remove: " + foundGuest.getName());
        guestEmailSet.remove(foundGuest.getEmail());
        guests.remove(foundGuest);
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

    public void getAllGuest() {

        if (guests.isEmpty()) {
            System.out.println("No guests found.");
            return;
        }

        for (Guest guest : guests) {
            guest.displayInfo();
        }

        System.out.println();
        System.out.println("Linked HashSet: ");
        for (String element : guestNameHash) {
            System.out.println(element);
        }

    }


}
