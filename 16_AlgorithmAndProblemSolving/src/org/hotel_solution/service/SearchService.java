package org.hotel_solution.service;

import org.hotel_solution.model.Room;

import java.util.ArrayList;
import java.util.List;

public class SearchService {

    public Room searchRoom(List<Room> rooms, String keyword) {

        for (Room room : rooms) {
            if (room.matches(keyword)) {
                return room;
            }

        }
        return null;
    }

    public List<Room> searchRooms(List<Room> rooms, String keyword) {

        List<Room> results = new ArrayList<>();

        for (Room room : rooms) {
            if (room.matches(keyword)) {
                results.add(room);
            }
        }

        return results;
    }
}
