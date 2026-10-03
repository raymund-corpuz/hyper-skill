package org.simple_hop.hotel.repository;

import org.simple_hop.hotel.generic.GenericRepository;
import org.simple_hop.hotel.model.Guest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GuestRepository extends GenericRepository<Guest, Integer> {
    ArrayList<Guest> guests = new ArrayList<>();
    Map<Integer, Guest> guestMap = new HashMap<>();
    HashSet<String> uniqueEmails = new HashSet<>();

    public void add(Guest guest) {

        guests.add(guest);
        uniqueEmails.add(guest.getEmail());
        guestMap.put(guest.getId(), guest);
    }

    public void remove(Guest guest) {

        guests.remove(guest);
        uniqueEmails.remove(guest.getEmail());
        guestMap.remove(guest.getId());
    }

    public Guest get(int id) {

        for (Guest guest : guests) {
            if (guest.getId() == id) {
                return guest;
            }
        }

        return null;
    }

    public ArrayList<Guest> getAll() {
        return new ArrayList<>(guests);
    }

    public boolean emailExists(String email) {
        return uniqueEmails.contains(email);
    }

}
