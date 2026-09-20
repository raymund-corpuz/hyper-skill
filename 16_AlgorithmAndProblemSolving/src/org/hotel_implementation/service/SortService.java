package org.hotel_implementation.service;

import org.hotel_implementation.model.Room;

import java.util.*;

public class SortService {

    //sort by price
    public void sortByPrice(List<Room> rooms) {

        rooms.sort((r1, r2) -> Double.compare(r1.getPrice(), r2.getPrice()));

    }

    //sort by roomType
    public void sortByRoomType(List<Room> rooms) {

        rooms.sort(new Comparator<Room>() {
            @Override
            public int compare(Room r1, Room r2) {
                return r1.getRoomType().compareToIgnoreCase(r2.getRoomType());
            }
        });
    }

    //get roomTypes in insertion order
    public Set<String> getRoomTypesInInsertionOrder(List<Room> rooms) {

        Set<String> types = new LinkedHashSet<>();

        for (Room room : rooms) {
            types.add(room.getRoomType());
        }
        return types;
    }

    //get sorted roomTypes
    public Set<String> getSortedRoomTypes(List<Room> rooms) {

        Set<String> types = new TreeSet<>();

        for (Room room : rooms) {
            types.add(room.getRoomType());
        }
        return types;
    }
}
