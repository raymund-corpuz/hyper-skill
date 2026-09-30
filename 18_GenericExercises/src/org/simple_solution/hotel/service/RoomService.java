package org.simple_solution.hotel.service;

import org.simple_solution.hotel.exception.RoomNotAvailableException;
import org.simple_solution.hotel.model.Room;
import org.simple_solution.hotel.repository.RoomRepository;

import java.util.ArrayList;
import java.util.Comparator;

public class RoomService {

    private final RoomRepository repository;

    public RoomService(RoomRepository repository) {
        this.repository = repository;
    }

    public void addRoom(Room room) {

        if (repository.searchById(room.getRoomNumber()) != null) {
            System.out.println("Room already exists.");
            return;
        }

        repository.addRoom(room);
        System.out.println("Room added successfully.");
    }

    public Room findRoom(int roomNumber) {
        Room room = repository.searchById(roomNumber);

        if (room == null) {
            throw new RoomNotAvailableException("Room not found: " + roomNumber);
        }
        return room;
    }

    public void removeRoom(int roomNumber) {

        Room room = findRoom(roomNumber);

        repository.remove(room.getRoomNumber());
        System.out.println("Room successfully remove.");
    }

    public void displayRooms() {

        ArrayList<Room> rooms = repository.getRooms();

        if (rooms.isEmpty()) {
            System.out.println("No Available rooms.");
            return;
        }

        rooms.forEach(Room::displayInfo);
    }

    public void displayRoomsByPrice() {
        ArrayList<Room> rooms = repository.getRooms();

        rooms.sort(Comparator.comparingDouble(Room::getPrice));

        rooms.forEach(Room::displayInfo);
    }
}
