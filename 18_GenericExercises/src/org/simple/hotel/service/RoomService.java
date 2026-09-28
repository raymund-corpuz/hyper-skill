package org.simple.hotel.service;

import org.simple.hotel.model.Room;
import org.simple.hotel.repositories.RoomRepository;

public class RoomService {

    RoomRepository roomRepository = new RoomRepository();

    public void registerRoom(Room room) {
        roomRepository.addRoom(room);
    }

    public void removeRoom(Room room) {
        Room foundRoom = roomRepository.findRoom(room.getRoomNumber());

        roomRepository.removeRoom(foundRoom);
    }

    public Room searchRoom(Room room) {
        return roomRepository.findRoom(room.getRoomNumber());
    }

    public void showAvailableRooms() {
        roomRepository.findAvailableRooms();
    }
}
