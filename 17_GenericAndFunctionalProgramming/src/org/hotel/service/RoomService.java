package org.hotel.service;

import org.hotel.exception.RoomNotFoundException;
import org.hotel.model.Room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomService {
    private List<Room> rooms = new ArrayList<>();
    private Map<String, Room> roomMap = new HashMap<>();

    //addRoom()
    public void addRoom(Room room) {

        rooms.add(room);

        roomMap.put(room.getRoomNumber(), room);
    }

    //findRoom()
    public Room findRoom(String roomNumber) throws RoomNotFoundException {
        Room room = roomMap.get(roomNumber);

        if (room == null) {
            throw new RoomNotFoundException("Room not found: " + roomNumber);
        }

        return room;
    }


    //displayRooms
    public void displayRooms() {
        if (rooms.isEmpty()) {
            System.out.println("No rooms found.❌");
            return;
        }

        for (Room room : rooms) {
            room.display();
        }
    }
}
