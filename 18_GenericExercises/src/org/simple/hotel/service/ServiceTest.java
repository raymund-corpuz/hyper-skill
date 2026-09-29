package org.simple.hotel.service;

import org.simple.hotel.model.Guest;
import org.simple.hotel.model.Room;
import org.simple.hotel.model.RoomType;

public class ServiceTest {
    public static void main(String[] args) {

        GuestService guestService = new GuestService();
        RoomService roomService = new RoomService();

        Guest firstGuest = new Guest("G001", "Ray", "ray@email.com", "09123456789", 1);

        Guest secondGuest = new Guest("G002", "George", "george@email.com", "0912341241", 1);

        Guest thirdGuest = new Guest("G003", "Ray", "raymund@email.com", "09123456789", 1);

        guestService.guestRepository.addGuest(firstGuest);
        guestService.guestRepository.addGuest(secondGuest);
        guestService.guestRepository.addGuest(thirdGuest);
        guestService.guestRepository.getAllGuest();

        System.out.println("---------------------------------------");
        System.out.println();

        Room roomOne = new Room("R001", RoomType.SINGLE, 1500, true, 1, "Garden");
        Room roomTwo = new Room("R002", RoomType.SINGLE, 1500, true, 1, "Garden");
        Room roomThree = new Room("R003", RoomType.SINGLE, 1500, false, 1, "Garden");

        roomService.roomRepository.addRoom(roomOne);
        roomService.roomRepository.addRoom(roomTwo);
        roomService.roomRepository.addRoom(roomThree);

        roomService.roomRepository.getAllRooms();

        System.out.println();
        System.out.println("Available Rooms: ");
        roomService.roomRepository.findAvailableRooms();

    }
}
