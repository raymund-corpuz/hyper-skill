package org.hotel_solution.service;

import org.hotel_solution.exception.RoomNotFoundException;
import org.hotel_solution.model.Room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomService {
    private final List<Room> rooms = new ArrayList<>();
    private final Map<String, Room> roomMap = new HashMap<>();

    public void addRoom(Room room) {
        rooms.add(room);

        roomMap.put(room.getRoomNumber(), room);
    }

    public Room findRoom(String roomNumber) throws RoomNotFoundException {
        Room room = roomMap.get(roomNumber);

        if (room == null) {
            throw new RoomNotFoundException("Room not found: " + roomNumber);
        }
        return room;
    }

    public void displayRooms() {

        if (rooms.isEmpty()) {
            System.out.println("No rooms available.");
            return;
        }

        for (Room room : rooms) {
            room.display();
        }
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public Map<String, Room> getRoomMap() {
        return roomMap;
    }

}
