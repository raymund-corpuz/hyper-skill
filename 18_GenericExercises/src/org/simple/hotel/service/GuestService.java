package org.simple.hotel.service;

import org.simple.hotel.model.Guest;
import org.simple.hotel.repositories.GuestRepository;

public class GuestService {

    GuestRepository guestRepository = new GuestRepository();

    public void registerGuest(Guest guest) {
        guestRepository.addGuest(guest);
    }

    public void removeGuest(Guest guest) {
        Guest foundGuest = guestRepository.findGuest(guest.getId());
        guestRepository.removeGuest(foundGuest);
    }

    public Guest searchGuest(Guest guest) {
        return guestRepository.findGuest(guest.getId());
    }

    public void displayGuests() {
        guestRepository.getAllGuest();
    }
}
