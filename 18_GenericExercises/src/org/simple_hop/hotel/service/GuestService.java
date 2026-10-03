package org.simple_hop.hotel.service;

import org.simple_hop.hotel.model.Guest;
import org.simple_hop.hotel.repository.GuestRepository;
import org.simple_solution.hotel.exception.GuestNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class GuestService {
    private final GuestRepository repository;

    public GuestService(GuestRepository repository) {
        this.repository = repository;
    }

    public void registerGuest(Guest guest) throws GuestNotFoundException {

        if (guest == null) {
            throw new GuestNotFoundException("Guest Not Found.");
        }

        if (repository.emailExists(guest.getEmail())) {
            System.out.println("Email already exists.");
            return;
        }

        repository.add(guest);
        System.out.println("Guest registered.✅");
    }

    public Guest findGuest(Guest guest) throws GuestNotFoundException {

        if (guest == null) {
            throw new GuestNotFoundException("Guest ID Not Found.");
        }

        return repository.get(guest.getId());
    }

    public void removeGuest(Guest guest) throws GuestNotFoundException {

        Guest foundGuest = findGuest(guest);

        repository.remove(foundGuest);
        System.out.println("Remove guest.✅");
    }

    public void getAllGuests() {

        ArrayList<Guest> guests = repository.getAll();

        if (guests.isEmpty()) {
            System.out.println("No guests found.");
        }

        guests.forEach(Guest::displayInfo);
    }

}
