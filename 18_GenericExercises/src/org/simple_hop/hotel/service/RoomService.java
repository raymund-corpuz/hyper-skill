package org.simple_hop.hotel.service;

import org.simple_hop.hotel.exception.RoomNotAvailableException;
import org.simple_hop.hotel.model.Room;
import org.simple_hop.hotel.repository.RoomRepository;


public class RoomService {

    private final RoomRepository repository;

    public RoomService(RoomRepository repository) {
        this.repository = repository;

    }

    public void registerRoom(Room room) throws RoomNotAvailableException {
        repository.add(room);

    }

    public Room searchRoom(Room room) {
        return repository.find(room.getRoomNumber());
    }

    public void removeRoom(Room room) {
        repository.remove(room);
    }
}
