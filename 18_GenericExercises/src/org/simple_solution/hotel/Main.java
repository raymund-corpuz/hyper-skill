package org.simple_solution.hotel;

import org.simple.hotel.model.Booking;
import org.simple.hotel.model.RoomType;
import org.simple_solution.hotel.exception.GuestNotFoundException;
import org.simple_solution.hotel.file.FileManager;
import org.simple_solution.hotel.model.Guest;
import org.simple_solution.hotel.model.Room;
import org.simple_solution.hotel.repository.BookingRepository;
import org.simple_solution.hotel.repository.GuestRepository;
import org.simple_solution.hotel.repository.RoomRepository;
import org.simple_solution.hotel.service.BookingService;
import org.simple_solution.hotel.service.GuestService;
import org.simple_solution.hotel.service.RoomService;
import org.simple_solution.hotel.util.IdGenerator;
import org.simple_solution.hotel.util.InputHelper;

import java.util.List;

public class Main {

    private final InputHelper input;

    private final GuestRepository guestRepository;
    private final RoomRepository roomRepository;
    private final BookingRepository bookingRepository;

    private final GuestService guestService;
    private final RoomService roomService;
    private final BookingService bookingService;

    private final FileManager fileManager;

    public Main() {

        input = new InputHelper();

        guestRepository = new GuestRepository();

        roomRepository = new RoomRepository();

        bookingRepository = new BookingRepository();

        guestService = new GuestService(guestRepository);

        roomService = new RoomService(roomRepository);

        bookingService = new BookingService(bookingRepository, guestService, roomService);

        fileManager = new FileManager();
    }

    public static void main(String[] args) {

        Main application = new Main();

        application.run();
    }

    public void run() {

        loadData();

        boolean running = true;

        while (running) {

            displayMainMenu();

            int choice = input.readInt("Enter choice: ");

            switch (choice) {
                case 1 -> guestMenu();
                case 2 -> roomMenu();
                case 3 -> bookingMenu();
                case 4 -> searchMenu();
                case 5 -> displayData();
                case 6 -> saveData();
                case 7 -> demonstrateOOP();
                case 8 -> demonstrateGenerics();
                case 0 -> {
                    saveData();
                    running = false;
                    System.out.println("Thank you for using the Hotel Management System.");
                }
                default -> System.out.println("Invalid choice.");

            }
        }
        input.close();
    }

    private void displayMainMenu() {

        System.out.println();
        System.out.println("============================================");
        System.out.println("            HOTEL MANAGEMENT SYSTEM");
        System.out.println("============================================");

        System.out.println("1. Guest Management");
        System.out.println("2. Room Management");
        System.out.println("3. Booking Management");
        System.out.println("4. Search");
        System.out.println("5. Display Data");
        System.out.println("6. Save Data");
        System.out.println("7. OOP Demonstration");
        System.out.println("8. Generics Demonstration");
        System.out.println("0. Exit");
        System.out.println("============================================");

    }

    //==============
    // Guest Menu
    //==============

    private void guestMenu() {
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("==== Guest Management ====");
            System.out.println("1. Add Guest");
            System.out.println("2. Remove Guest");
            System.out.println("3. Find Guest");
            System.out.println("4. Display Guest");
            System.out.println("5. Search Guest By Name");
            System.out.println("0. Back");

            int choice = input.readInt("Enter choice: ");

            switch (choice) {
                case 1 -> addGuest();
                case 2 -> removeGuest();
                case 3 -> findGuest();
                case 4 -> guestService.displayGuests();
                case 5 -> searchGuestByName();
                case 0 -> running = false;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    public void addGuest() {

        String name = input.readString("Name: ");
        String email = input.readString("Email: ");
        String phone = input.readString("Phone:");
        int id = IdGenerator.nextGuestId();

        Guest guest = new Guest(id, name, email, phone);

        guestService.registerGuest(guest);
    }

    public void removeGuest() {

        int id = input.readInt("Guest ID: ");

        try {
            guestService.removeGuest(id);
        } catch (GuestNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void findGuest() {

        int id = input.readInt("Guest ID: ");

        try {

            Guest guest = guestService.findGuest(id);
            guest.displayInfo();
        } catch (GuestNotFoundException e) {

            System.out.println(e.getMessage());
        }
    }

    public void searchGuestByName() {

        String keyword = input.readString("Search name: ");

        List<Guest> results = guestService.searchByName(keyword);

        if (results.isEmpty()) {
            System.out.println("No matching guests.");
            return;
        }

        results.forEach(Guest::displayInfo);
    }

    //===========
    //Room Menu
    //===========

    private void roomMenu() {

        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("==== Room Management ====");
            System.out.println("1. Add Room");
            System.out.println("2. Remove Room");
            System.out.println("3. Find Room");
            System.out.println("4. Display Rooms");
            System.out.println("5. Display Available Rooms");
            System.out.println("6. Display Rooms By Price");
            System.out.println("0. Back");

            int choice = input.readInt("Enter choice: ");

            switch (choice) {
                case 1 -> addRoom();
                case 2 -> removeRoom();
                case 3 -> findRoom();
                case 4 -> roomService.displayRooms();
                case 5 -> roomService.displayAvailableRooms();
                case 6 -> roomService.displayRoomsByPrice();
                case 0 -> running = false;
                default -> System.out.println("Invalid choice");
            }

        }
        input.close();
    }

    private void addRoom() {

        int roomNumber = input.readInt("Room Number: ");

        System.out.println("1. SINGLE");
        System.out.println("2. DOUBLE");
        System.out.println("3. DELUXE");
        System.out.println("4. SUITE");

        int typeChoice = input.readInt("Room Type: ");

        RoomType roomType;

        switch (typeChoice) {
            case 1 -> roomType = RoomType.SINGLE;
            case 2 -> roomType = RoomType.DOUBLE;
            case 3 -> roomType = RoomType.DELUXE;
            case 4 -> roomType = RoomType.SUITE;
            default -> {

                System.out.println("Invalid room type.");
                return;
            }
        }
        double price = input.readDouble("Price: ");

        Room room = new Room(roomNumber, roomType, price, true);

        roomService.addRoom(room);
    }

    private void removeRoom() {

        int roomNumber = input.readInt("Room number: ");

        roomService.removeRoom(roomNumber);
    }

    private void findRoom() {

        int roomNumber = input.readInt("Room number: ");

        Room room = roomService.findRoom(roomNumber);

        if (room == null) {
            System.out.println("Room does not exists.");
            return;
        }
        room.displayInfo();

    }

    //===================
    // Booking Menu
    //===================
}
