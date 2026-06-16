package org.hyperskill.hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel[] room = new Hotel[5];
        Scanner scanner = new Scanner(System.in);

        room[0] = new Hotel(101, "Standard", 2500, true);
        room[1] = new Hotel(102, "Deluxe", 4500, true);
        room[2] = new Hotel(103, "Suite", 7000, false);
        room[3] = new Hotel(104, "Standard", 2500, true);
        room[4] = new Hotel(105, "Executive", 9000, true);

        displayAllRooms(room);
        Hotel selectedRoom = selectRoom(scanner, room);
        if (selectedRoom == null) {
            return;
        }
        processReservation(scanner, selectedRoom);
        if (selectedRoom.getIsAvailable()) {
            displayReservationReceipt(selectedRoom);
        } else {
            return;
        }
    }

    public static void displayAllRooms(Hotel[] room) {
        System.out.println("==== HOTEL ROOMS ====");
        System.out.println();
        for (int i = 0; i < room.length; i++) {
            System.out.println((i + 1) + ". " + room[i].displayRoomInfo());
        }
        System.out.println();
    }

    public static Hotel selectRoom(Scanner scanner, Hotel[] rooms) {
        System.out.print("Choose Room: ");
        int roomChoice = scanner.nextInt();
        roomChoice--;
        if (roomChoice < 0 || roomChoice >= rooms.length) {
            System.out.println("Invalid Input❌");
            return null;
        }
        return rooms[roomChoice];
    }

    public static void processReservation(Scanner scanner, Hotel room) {
        System.out.print("Enter Guest Name: ");
        String guest = scanner.next();
        System.out.print("Enter Number of Nights: ");
        int night = scanner.nextInt();
        room.reserveRoom(guest, night);
    }

    public static void displayReservationReceipt(Hotel room) {
        System.out.println("==== RESERVATION RECEIPT ====");
        System.out.println();
        System.out.println("Guest: " + room.getGuestName());
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Room Type: " + room.getRoomType());
        System.out.println();
        System.out.println("Price Per Night: " + room.getPricePerNight());
        System.out.println("Nights: " + room.getNights());
        System.out.println();
        System.out.println("Total Cost: " + room.calculateReservationCost());
        System.out.println();
    }


}
