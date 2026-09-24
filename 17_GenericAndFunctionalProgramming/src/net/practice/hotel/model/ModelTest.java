package net.practice.hotel.model;

import net.practice.hotel.model.enums.RoomStatus;
import net.practice.hotel.model.enums.RoomType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ModelTest {

    public static void main(String[] args) {

        Guest guest = new Guest("G001", "Raymund", "Corpuz", "raymund@example.com", "09123456789", "Pozorrubio");

        System.out.println("Display Guest: ");
        guest.displayProfile();
        System.out.println("-------------------------");
        System.out.println("Modify Guest: ");
        guest.setEmail("raymund@gmail.com");
        guest.displayProfile();
        System.out.println("--------------------------------");

        Room room = new Room("R001", RoomType.SINGLE, 1500, RoomStatus.RESERVE);

        System.out.println("Display Room: ");
        room.displayRoom();
        System.out.println("-----------------------------");
        System.out.println("Modify Room: ");
        room.setRoomType(RoomType.DOUBLE);
        room.displayRoom();
        System.out.println("-------------------------------");


        Booking book = new Booking("B001", guest, room, LocalDate.now(), LocalDateTime.of(2026, 10, 21, 4, 3));

        System.out.println("Display Booking:");
        book.displayBooking();
        System.out.println("----------------------------");
        System.out.println("Modify: ");
        book.setCheckInDate(LocalDate.of(2026, 9, 21));
        book.displayBooking();

    }
}
