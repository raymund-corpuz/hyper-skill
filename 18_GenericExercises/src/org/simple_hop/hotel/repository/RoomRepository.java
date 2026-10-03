package org.simple_hop.hotel.repository;

import org.simple_hop.hotel.generic.GenericRepository;
import org.simple_hop.hotel.model.Room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RoomRepository extends GenericRepository<Room, Integer> {

    ArrayList<Room> rooms = new ArrayList<>();
    Map<Integer, Room> roomMap = new HashMap<>();

    public void add(Room room) {

        if (room == null) {
            System.out.println("Room not found.");
            return;
        }

        rooms.add(room);
        roomMap.put(room.getRoomNumber(), room);
        System.out.println("Room Added.✅");
    }

    public void remove(Room room) {

        if (room == null) {
            System.out.println("Room not found.");
            return;
        }

        rooms.remove(room);
        roomMap.remove(room.getRoomNumber(), room);
        System.out.println("Room was remove.✅");
    }

    public Room find(int roomNumber) {

        Room room = rooms.get(roomNumber);

        if (room == null) {
            System.out.println("Room Not Found: " + roomNumber);
            return null;
        }

        return room;
    }

    public ArrayList<Room> getAll() {
        return new ArrayList<>(rooms);
    }

    public ArrayList<Room> getRoomsAvailable() {
        ArrayList<Room> availableRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }

        if (availableRooms.isEmpty()) {
            System.out.println("Rooms are occupied.");
            return null;
        }

        return availableRooms;
    }

}
