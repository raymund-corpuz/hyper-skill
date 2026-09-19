package org.hotel_implementation.service;

import org.hotel_implementation.model.Room;
import org.hotel_solution.exception.RoomNotFoundException;

import java.util.*;

public class RoomService {
    List<Room> rooms = new ArrayList<>();
    Map<String, Room> roomMap = new TreeMap<>();


    //add room
    public void addRoom(Room room) {
        rooms.add(room);

        roomMap.put(room.getRoomNumber(), room);
    }

    //find room
    public Room findRoom(String roomNumber) throws RoomNotFoundException {
        Room room = roomMap.get(roomNumber);

        if (room == null) {
            throw new RoomNotFoundException("Room Not Found.❌");
        }

        return room;
    }

    //display rooms
    public void displayRooms() {

        if (rooms.isEmpty()) {
            System.out.println("No rooms available.❌");
            return;
        }

        for (Room room : rooms) {
            room.display();
        }
    }
}
