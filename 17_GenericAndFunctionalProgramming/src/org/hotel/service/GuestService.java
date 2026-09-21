package org.hotel.service;

import org.hotel.exception.GuestNotFoundException;
import org.hotel.model.Guest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuestService {
    private List<Guest> guests = new ArrayList<>();
    private Map<String, Guest> guestMap = new HashMap<>();
    

    //addGuest()
    public void addGuest(Guest guest) {
        guests.add(guest);

        guestMap.put(guest.getId(), guest);
    }

    //findGuest()
    public Guest findGuest(String id) throws GuestNotFoundException {
        Guest guest = guestMap.get(id);

        if (guest == null) {
            throw new GuestNotFoundException("Guest Not Found :" + id);
        }

        return guest;
    }

    //removeGuest()
    public void removeGuest(String id) throws GuestNotFoundException {
        Guest guest = findGuest(id);

        guests.remove(guest);

        guestMap.remove(id);
    }


    //displayGuests
    public void displayGuests() {
        if (guests.isEmpty()) {
            System.out.println("No guests found.❌");
        }

        for (Guest guest : guests) {
            guest.displayProfile();
        }
    }
}
