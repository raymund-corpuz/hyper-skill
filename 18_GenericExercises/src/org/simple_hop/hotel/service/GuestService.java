package org.simple_hop.hotel.service;

import org.simple_hop.hotel.exception.GuestNotFoundException;
import org.simple_hop.hotel.model.Guest;
import org.simple_hop.hotel.repository.GuestRepository;


import java.util.ArrayList;
import java.util.List;

public class GuestService {
    private final GuestRepository repository;

    public GuestService(GuestRepository repository) {
        this.repository = repository;
    }

    public void registerGuest(Guest guest) throws GuestNotFoundException {

        if (repository.emailExists(guest.getEmail())) {
            System.out.println("Email already exists.");
            return;
        }

        repository.add(guest);
        System.out.println("Successfully added new guest: " + guest.getName());
    }

    public Guest findGuest(int id) throws GuestNotFoundException {

        Guest guest = repository.get(id);

        if (guest == null) {
            throw new GuestNotFoundException("Guest ID Not Found.❌" + id);
        }

        return guest;
    }

    public void removeGuest(Guest guest) throws GuestNotFoundException {

        Guest foundGuest = findGuest(guest.getId());

        repository.remove(foundGuest);
        System.out.println("Guest is removed: " + foundGuest.getName());
    }

    public void getAllGuests() throws GuestNotFoundException {

        ArrayList<Guest> guests = repository.getAll();

        if (guests.isEmpty()) {
            throw new GuestNotFoundException("No guests found.❌");
        }

        guests.forEach(Guest::displayInfo);
    }

}
