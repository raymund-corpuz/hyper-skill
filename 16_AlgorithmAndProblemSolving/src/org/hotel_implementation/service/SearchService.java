package org.hotel_implementation.service;

import org.hotel_implementation.model.Room;

import java.util.ArrayList;
import java.util.List;

public class SearchService {
    List<Room> results = new ArrayList<>();

    public Room searchRoom(List<Room> rooms, String keyword) {

        for (Room room : rooms) {
            if (room.matches(keyword)) {
                return room;
            }
        }

        return null;
    }

    public List<Room> searchRooms(List<Room> rooms, String keyword) {

        for (Room room : rooms) {
            if (room.matches(keyword)) {
                results.add(room);
            }
        }
        return results;
    }
}
