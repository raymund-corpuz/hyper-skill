package org.simple.hotel.repositories;

import org.simple.hotel.model.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RoomRepository {

    List<Room> rooms = new ArrayList<>();
    Set<String> roomSet = new TreeSet<>();

    public void addRoom(Room room) {
        System.out.println("Successfully added: " + room.getRoomNumber());

        rooms.add(room);
        roomSet.add(room.getRoomNumber());
    }

    public void removeRoom(Room room) {

        Room foundRoom = findRoom(room.getRoomNumber());

        System.out.println("Successfully remove: " + foundRoom.getRoomNumber());

        rooms.remove(foundRoom);
        roomSet.remove(foundRoom.getRoomNumber());
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

        System.out.println();
        System.out.println("Rooms: ");
        if (rooms.isEmpty()) {
            System.out.println("No rooms found.");
            return null;
        }

//        for (Room room : rooms) {
//            room.displayInfo();
//        }

        for (String room : roomSet) {
            System.out.println(room);
        }

        return rooms;
    }

    public void findAvailableRooms() {

        List<Room> availableRooms = new ArrayList<>();
        
        for (Room room : rooms) {
            if (room.isAvailable()) {
                room.displayInfo();
                availableRooms.add(room);
            }
        }

        if (availableRooms.isEmpty()) {
            System.out.println("Rooms are all occupied.");
            return;
        }
    }
}
