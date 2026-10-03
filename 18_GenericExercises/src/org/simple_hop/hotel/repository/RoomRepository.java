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

        rooms.add(room);
        roomMap.put(room.getRoomNumber(), room);
    }

    public void remove(Room room) {

        rooms.remove(room);
        roomMap.remove(room.getRoomNumber(), room);
    }

    public Room find(int roomNumber) {

        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
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

        return availableRooms;
    }

}
