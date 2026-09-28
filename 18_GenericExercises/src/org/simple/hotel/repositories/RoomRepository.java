package org.simple.hotel.repositories;

import org.simple.hotel.model.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomRepository {

    List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        System.out.println("Successfully added: " + room.getRoomNumber());

        rooms.add(room);
    }

    public void removeRoom(Room room) {
        System.out.println("Successfully remove: " + room.getRoomNumber());

        rooms.remove(room);
    }

    public Room findRoom(String roomId) {

        for (Room room : rooms) {
            if (room.getRoomNumber().matches(roomId)) {
                return room;
            }
        }

        System.out.println("Room ID is Not Found: " + roomId);
        return null;
    }

    public List<Room> getAllRooms() {

        if (rooms.isEmpty()) {
            System.out.println("No rooms found.");
            return null;
        }

        for (Room room : rooms) {
            room.displayInfo();
        }

        return rooms;
    }

    public List<Room> findAvailableRooms() {

        List<Room> availableRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (room.isAvailable()) {
                room.displayInfo();
                availableRooms.add(room);
            }
        }

        if (availableRooms.isEmpty()) {
            System.out.println("Rooms are all occupied.");
            return null;
        }

        return availableRooms;
    }
}
