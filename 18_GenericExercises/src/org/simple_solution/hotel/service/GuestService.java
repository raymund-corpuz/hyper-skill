package org.simple_solution.hotel.service;


import org.simple_solution.hotel.exception.GuestNotFoundException;
import org.simple_solution.hotel.model.Guest;
import org.simple_solution.hotel.model.GuestSummary;
import org.simple_solution.hotel.repository.GuestRepository;

import java.util.ArrayList;
import java.util.List;

public class GuestService {

    private final GuestRepository repository;

    public GuestService(GuestRepository repository) {
        this.repository = repository;
    }

    public void registerGuest(Guest guest) {

        if (repository.emailExists(guest.getEmail())) {
            System.out.println("Email already exists.");
            return;
        }

        repository.add(guest);

        System.out.println("Guest registered successfully.✅");
    }

    public Guest findGuest(int id) {

        Guest guest = repository.searchById(id);

        if (guest == null) {
            throw new GuestNotFoundException("Guest with ID " + id + " was not found.");
        }
        return guest;

    }

    public void removeGuest(int id) {

        Guest guest = findGuest(id);

        repository.remove(guest.getId());

        System.out.println("Guest remove successfully.✅");

    }

    public void displayGuests() {

        ArrayList<Guest> guests = repository.getAll();

        if (guests.isEmpty()) {
            System.out.println("No found guests.❌");
            return;
        }

        guests.forEach(Guest::displayInfo);
    }

    /*
     * Lambda expression
     */

    public List<Guest> searchByName(String keyword) {

        return repository.getAll().stream().filter(guest -> guest.getName().toLowerCase().contains(keyword.toLowerCase())).toList();
    }


    /*
     * Record
     */
    public GuestSummary createSummary(Guest guest) {
        return new GuestSummary(guest.getId(), guest.getName(), guest.getEmail());
    }

}
