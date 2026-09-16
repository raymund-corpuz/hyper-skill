package org.hotel.app;

import org.hotel.model.Guest;
import org.hotel.model.Reservation;
import org.hotel.model.Room;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Guest> guests = new ArrayList<>();
        List<Room> rooms = new ArrayList<>();
        List<Reservation> reservations = new ArrayList<>();
        LinkedList<Reservation> reservationQueue = new LinkedList<>();
        Set<String> guestIds = new HashSet<>();
        Set<String> roomTypes = new LinkedHashSet<>();
        Set<String> sortedRoomTypes = new TreeSet<>();
        Map<String, Room> roomMap = new HashMap<>();


        roomTypes.add("Single");
        roomTypes.add("Double");
        roomTypes.add("Suite");
        roomTypes.add("Single");

        System.out.println("Expected: ");
        System.out.println();
        for (String roomType : roomTypes) {
            sortedRoomTypes.add(roomType);
            System.out.println(roomType);
        }
        System.out.println();
        System.out.println("Sorted Room Types:");
        System.out.println();
        for (String sortedRoomType : sortedRoomTypes) {
            System.out.println(sortedRoomType);
        }


        guests.add(new Guest(
                "G001",
                "Raymund Corpuz",
                "0992-111-1111",
                "raymund@email.com"
        ));

        guests.add(new Guest(
                "G002",
                "John Santos",
                "0992-222-2222",
                "john@email.com"
        ));

        guests.add(new Guest(
                "G003",
                "Maria Cruz",
                "0992-333-3333",
                "maria@email.com"
        ));

        guests.add(new Guest(
                "G004",
                "Daniel Reyes",
                "0992-444-4444",
                "daniel@email.com"
        ));

        guests.add(new Guest(
                "G005",
                "Sofia Garcia",
                "0992-555-5555",
                "sofia@email.com"
        ));

        rooms.add(new Room(
                "101",
                "Single",
                1500,
                true
        ));

        rooms.add(new Room(
                "102",
                "Single",
                1500,
                true
        ));

        rooms.add(new Room(
                "103",
                "Single",
                1500,
                false
        ));

        rooms.add(new Room(
                "201",
                "Double",
                2500,
                true
        ));

        rooms.add(new Room(
                "202",
                "Double",
                2500,
                true
        ));

        rooms.add(new Room(
                "203",
                "Double",
                2500,
                false
        ));

        rooms.add(new Room(
                "301",
                "Suite",
                4000,
                true
        ));

        rooms.add(new Room(
                "302",
                "Suite",
                4000,
                true
        ));

        rooms.add(new Room(
                "401",
                "Deluxe",
                3500,
                true
        ));

        rooms.add(new Room(
                "402",
                "Deluxe",
                3500,
                false
        ));

        reservations.add(new Reservation(
                "RES001",
                guests.get(0),
                rooms.get(0),
                3
        ));

        reservations.add(new Reservation(
                "RES002",
                guests.get(1),
                rooms.get(3),
                2
        ));

        reservations.add(new Reservation(
                "RES003",
                guests.get(2),
                rooms.get(6),
                5
        ));

        reservations.add(new Reservation(
                "RES004",
                guests.get(3),
                rooms.get(8),
                2
        ));

        reservations.add(new Reservation(
                "RES005",
                guests.get(4),
                rooms.get(1),
                4
        ));

        checkRoomAvailable(roomMap, rooms, scanner);
        //addReservation(guests, rooms, reservations, reservationQueue, guestIds, scanner);

        //searchReservationGuestId(guestIds, reservations, scanner);
        //addReservation(guests, rooms, reservations, reservationQueue, guestIds, scanner);

        scanner.close();
    }

    public static void addReservation(List<Guest> guests, List<Room> rooms, List<Reservation> reservations, LinkedList<Reservation> reservationQue, Set<String> guestIds, Scanner scanner) {
        System.out.println("=====================================");
        System.out.println("                Add Reservation ");
        System.out.println("=====================================");
        System.out.println();
        System.out.println("Guests:");
        for (Guest guest : guests) {
            guest.displayProfile();
        }
        System.out.println();
        System.out.println("Rooms Available:");

        for (Room room : rooms) {
            if (room.isAvailable()) {
                room.display();
            }
        }
        System.out.println();


        String reservationId = "RES00" + (reservations.size() + 1);
        System.out.print("Select Guest ");
        int selectGuest = selectOption(scanner);
        selectGuest--;

        if (selectGuest < 0 || selectGuest >= guests.size()) {
            System.out.println("Guest Not Found.❌");
            return;
        }
        Guest selectedGuest = guests.get(selectGuest);

        boolean duplicatedBooking = guestIds.contains(selectedGuest.getId());

        if (duplicatedBooking) {
            System.out.println("Duplicate Booking: Please check reservation list.");
            return;
        }

        System.out.print("Select Room: ");
        int selectRoom = selectOption(scanner);
        selectRoom--;
        if (selectRoom < 0 || selectRoom >= rooms.size()) {
            System.out.println("Room Not Found.❌");
            return;
        }

        Room selectedRoom = rooms.get(selectRoom);

        System.out.println();
        System.out.print("Enter Number of Nights: ");
        int nights = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Successfully Added a Reservation.✅");
        guestIds.add(selectedGuest.getId());
        reservationQue.addLast(new Reservation(reservationId, selectedGuest, selectedRoom, nights));
        System.out.println();
        reservationQue.getLast().display();

    }

    public static int selectOption(Scanner scanner) {
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    public static void searchReservationGuestId(Set<String> guestIds, List<Reservation> reservations, Scanner scanner) {
        System.out.println("=================================");
        System.out.println("        Reservation Guest List ");
        System.out.println("=================================");
        System.out.println();
        for (String guest : guestIds) {
            System.out.println(guest);
        }
        System.out.print("Enter Guest Id: ");
        String guestId = scanner.nextLine();

        for (Reservation reservation : reservations) {
            if (reservation.getGuest().getId().equalsIgnoreCase(guestId)) {
                reservation.display();
            }
        }
    }

    public static void checkRoomAvailable(Map<String, Room> roomMap, List<Room> rooms, Scanner scanner) {
        for (Room room : rooms) {
            roomMap.put(room.getRoomNumber(), room);
        }
        System.out.println();
        System.out.println("==== Check Room ====");
        System.out.println("Enter Room Number: ");
        String roomNumber = scanner.nextLine();
        Room selectedRoom = roomMap.get(roomNumber);

        selectedRoom.display();


    }

}
