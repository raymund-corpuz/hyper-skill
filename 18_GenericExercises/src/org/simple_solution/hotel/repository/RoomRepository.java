package org.simple_solution.hotel.repository;

import org.simple_solution.hotel.interfaces.Searchable;
import org.simple_solution.hotel.model.Room;

import java.util.*;

public class RoomRepository implements Searchable {


    private final ArrayList<Room> rooms = new ArrayList<>();

    private final HashMap<Integer, Room> roomMap = new HashMap<>();

    private final LinkedHashMap<Integer, Room> orderedRoomMap = new LinkedHashMap<>();

    private final TreeMap<Integer, Room> sortedRoomMap = new TreeMap<>();

    private final HashSet<Integer> roomNumbers = new HashSet<>();

    private final LinkedHashSet<Integer> orderedRoomNumbers = new LinkedHashSet<>();

    private final TreeSet<Integer> sortedRoomNumbers = new TreeSet<>();

    public void addRoom(Room room) {

        rooms.add(room);
        roomMap.put(room.getRoomNumber(), room);
        orderedRoomMap.put(room.getRoomNumber(), room);
        sortedRoomMap.put(room.getRoomNumber(), room);

        roomNumbers.add(room.getRoomNumber());
        orderedRoomNumbers.add(room.getRoomNumber());
        sortedRoomNumbers.add(room.getRoomNumber());
    }

    public void remove(int roomNumber) {

        Room room = roomMap.remove(roomNumber);

        if (room == null) {
            return;
        }
        rooms.remove(room);
        orderedRoomMap.remove(roomNumber);
        sortedRoomMap.remove(roomNumber);

        roomNumbers.remove(roomNumber);
        orderedRoomMap.remove(roomNumber);
        sortedRoomMap.remove(roomNumber);

    }

    @Override
    public Room searchById(int roomNumber) {
        return roomMap.get(roomNumber);
    }

    public ArrayList<Room> getRooms() {
        return new ArrayList<>(rooms);
    }

    public ArrayList<Room> getAvailableRooms() {
        ArrayList<Room> availableRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public TreeMap<Integer, Room> getSortedRoom() {
        return new TreeMap<>(sortedRoomMap);
    }

}
