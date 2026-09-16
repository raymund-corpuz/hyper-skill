package org.hotel_solution.service;

import org.hotel_solution.exception.GuestNotFoundException;
import org.hotel_solution.model.Guest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuestService {
    private final List<Guest> guests = new ArrayList<>();
    private final Map<String, Guest> guestMap = new HashMap<>();

    public void addGuest(Guest guest) {
        guests.add(guest);

        guestMap.put(guest.getId(), guest);
    }

    public Guest findGuest(String id) throws GuestNotFoundException {
        Guest guest = guestMap.get(id);

        if (guest == null) {
            throw new GuestNotFoundException("Guest not found: " + id);
        }

        return guest;
    }

    public void removeGuest(String id) throws GuestNotFoundException {
        Guest guest = findGuest(id);

        guests.remove(guest);

        guestMap.remove(id);
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void displayGuests() {
        if (guests.isEmpty()) {
            System.out.println("No guests found.");
            return;
        }

        for (Guest guest : guests) {

            System.out.println(guest);
        }
    }
}
