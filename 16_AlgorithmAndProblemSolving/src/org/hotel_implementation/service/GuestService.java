package org.hotel_implementation.service;

import org.hotel_implementation.model.Guest;
import org.hotel_solution.exception.GuestNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuestService {
    List<Guest> guests = new ArrayList<>();
    Map<String, Guest> guestMap = new HashMap<>();

    //add guest
    public void addGuest(Guest guest) {
        guests.add(guest);

        guestMap.put(guest.getId(), guest);
    }

    public Guest findGuest(String id) {
        Guest guest = guestMap.get(id);

        if (guest == null) {
            throw new GuestNotFoundException("Guest Not Found: " + id);
        }

        return guest;
    }

    //find guest
   /* public void findGuest(String id) {
        Guest guest = findId(id);

        guestMap.get(guest.getName());
    }

    public Guest findId(String id) throws GuestNotFoundException {
        Guest foundGuest = null;
        try {
            for (Guest guest : guests) {
                guest.getId().equalsIgnoreCase(id);
                foundGuest = guest;
            }
        } catch (Exception e) {
            throw new GuestNotFoundException("Guest Not Found.❌");
        }

        return foundGuest;
    }

 */


    //remove guest
    public void removeGuest(String id) throws GuestNotFoundException {
        Guest guest = findGuest(id);

        guests.remove(guest);
        guestMap.remove(id);
    }


    //display guest
    public void displayGuest() {
        if (guests.isEmpty()) {
            System.out.println("No guests found.❌");
            return;
        }
        for (Guest guest : guests) {
            guest.displayProfile();
        }
    }

}
