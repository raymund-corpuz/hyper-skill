package org.hotel_solution.service;

import org.hotel_solution.model.Room;

import java.util.*;

public class SortService {
    /*
     * LAMBDA
     */
    public void sortByPrice(List<Room> rooms){

        rooms.sort((r1, r2) -> Double.compare(r1.getPrice(), r2.getPrice()))
    }

    /*
     * ANONYMOUS CLASS
     */
    public void sortByRoomType(List<Room> rooms){

        rooms.sort(new Comparator<Room>() {
            @Override
            public int compare(Room r1, Room r2) {
                return r1.getRoomType().compareTo(r2.getRoomType());
            }
        });
    }

    /*
     * LINKEDHASHSET
     */
    public Set<String> getRoomTypesInInsertionOrder(List<Room> rooms){

        Set<String> types = new LinkedHashSet<>();

        for(Room room: rooms){
            types.add(room.getRoomType());
        }
        return types;
    }

    /*
     * TREESET
     */
    public Set<String> getSortedRoomTypes(List<Room> rooms){

        Set<String> types = new TreeSet<>();

        for(Room room: rooms){
            types.add(room.getRoomType());
        }

        return types;
    }

}
