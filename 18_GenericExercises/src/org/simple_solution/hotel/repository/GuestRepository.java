package org.simple_solution.hotel.repository;

import org.simple_solution.hotel.interfaces.Searchable;
import org.simple_solution.hotel.model.Guest;

import java.util.*;

public class GuestRepository implements Searchable<Guest> {
    //array
    private Guest[] guestArray = new Guest[100];
    //arrayList
    private final List<Guest> guests = new ArrayList<>();
    //linkedHashSet
    private final LinkedHashSet<String> guestEmail = new LinkedHashSet<>();
    //hashSet
    private final HashSet<String> uniqueNames = new HashSet<>();
    //treeSet
    private final TreeSet<Integer> guestIds = new TreeSet<>();
    //hashMap
    private final HashMap<Integer, Guest> guestMap = new HashMap<>();
    //linkedHashMap
    private final LinkedHashMap<Integer, Guest> orderGuestMap = new LinkedHashMap<>();
    //treeMap
    private final TreeMap<Integer, Guest> sortedGuestMap = new TreeMap<>();


    public void add(Guest guest) {

        guests.add(guest);

        guestEmail.add(guest.getEmail());
        uniqueNames.add(guest.getName());
        guestIds.add(guest.getId());

        guestMap.put(guest.getId(), guest);
        orderGuestMap.put(guest.getId(), guest);
        sortedGuestMap.put(guest.getId(), guest);

        addToArray(guest);
    }

    public void addToArray(Guest guest) {

        for (int i = 0; i < guestArray.length; i++) {

            if (guestArray[i] == null) {
                guestArray[i] = guest;
                break;
            }
        }
    }

    public void remove(int id) {

        Guest guest = guestMap.remove(id);

        if (guest == null) {
            return;
        }

        guests.remove(guest);
        guestEmail.remove(guest.getEmail());
        uniqueNames.remove(guest.getName());
        guestIds.remove(guest.getId());
        orderGuestMap.remove(id);
        sortedGuestMap.remove(id);

        for (int i = 0; i < guestArray.length; i++) {

            if (guestArray[i] != null && guestArray[i].getId() == id) {

                guestArray[i] = null;
                break;
            }
        }
    }

    @Override
    public Guest searchById(int id) {
        return guestMap.get(id);
    }

    public ArrayList<Guest> getAll() {
        return new ArrayList<>(guests);
    }

    public Collection<Guest> getSortedGuests() {
        return sortedGuestMap.values();
    }

    public boolean emailExists(String email) {
        return guestEmails.contains(email);
    }

    public TreeSet<Integer> getGuestIds() {
        return new TreeSet<>(guestIds);
    }
}
