package net.practice.hotel.interfaces;

import net.practice.hotel.model.Room;

import java.util.List;

public interface RoomRepository extends Repository<Room, String> {

    List<Room> findAvailableRooms();

    List<Room> findByRoomType(String roomType);

    List<Room> findByStatus(String status);
}
