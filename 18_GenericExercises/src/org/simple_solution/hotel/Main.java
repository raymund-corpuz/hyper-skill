package org.simple_solution.hotel;

import org.simple.hotel.model.RoomType;
import org.simple.hotel.record.GuestSummary;
import org.simple_solution.hotel.exception.BookingNotFoundException;
import org.simple_solution.hotel.exception.GuestNotFoundException;
import org.simple_solution.hotel.exception.RoomNotAvailableException;
import org.simple_solution.hotel.file.FileManager;
import org.simple_solution.hotel.generic.GenericRepository;
import org.simple_solution.hotel.generic.Pair;
import org.simple_solution.hotel.model.*;
import org.simple_solution.hotel.repository.BookingRepository;
import org.simple_solution.hotel.repository.GuestRepository;
import org.simple_solution.hotel.repository.RoomRepository;
import org.simple_solution.hotel.service.BookingService;
import org.simple_solution.hotel.service.GuestService;
import org.simple_solution.hotel.service.RoomService;
import org.simple_solution.hotel.util.IdGenerator;
import org.simple_solution.hotel.util.InputHelper;

import java.io.IOException;
import java.time.LocalDate;
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

    private void bookingMenu() {

        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println("==== Booking Management ====");
            System.out.println("1. Create Booking");
            System.out.println("2. Cancel Booking");
            System.out.println("3. Find Booking");
            System.out.println("4. Display Bookings");
            System.out.println("0. Back");

            int choice = input.readInt("Enter choice: ");

            switch (choice) {

                case 1 -> createBooking();
                case 2 -> cancelBooking();
                case 3 -> findBooking();
                case 4 -> bookingService.displayBookings();
                case 0 -> running = false;
                default -> {
                    System.out.println("Invalid choice");
                }
            }
        }
    }

    public void createBooking() {

        int guestId = input.readInt("Guest Id: ");
        int roomNumber = input.readInt("Room Number: ");
        String checkIn = input.readString("Check-in date: ");
        String checkOut = input.readString("Check-out date: ");
        int bookingId = IdGenerator.nextBookingId();

        try {
            Booking booking = bookingService.createBooking(bookingId, guestId, roomNumber, checkIn, checkOut);

            System.out.println("Booking create successfully.");
            booking.displayInfo();
        } catch (GuestNotFoundException | RoomNotAvailableException e) {
            System.out.println("Error in booking: " + e.getMessage());
        }
    }

    public void cancelBooking() {

        int bookingId = input.readInt("Booking Id: ");

        try {
            bookingService.cancelBooking(bookingId);

        } catch (GuestNotFoundException | RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }

    }

    public void findBooking() {

        int bookingId = input.readInt("Booking Id: ");

        try {
            Booking booking = bookingService.findBooking(bookingId);

            booking.displayInfo();

        } catch (BookingNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    //=======================
    //Search
    //=======================
    private void searchMenu() {

        System.out.println();
        System.out.println("==== Search Menu ====");
        System.out.println("1. Search Guest");
        System.out.println("2. Search Room");
        System.out.println("3. Search Booking");

        int choice = input.readInt("Enter choice: ");

        switch (choice) {
            case 1 -> findGuest();
            case 2 -> findRoom();
            case 3 -> findBooking();
            default -> {
                System.out.println("Invalid choice");
            }
        }
    }

    //=================
    //Display
    //=================

    public void displayData() {

        System.out.println();
        System.out.println("==== Guests ====");
        guestService.displayGuests();
        System.out.println();
        System.out.println("==== Rooms ====");
        roomService.displayRooms();
        System.out.println();
        System.out.println("==== Bookings ====");
        bookingService.displayBookings();
    }

    //==================
    //File Processing
    //==================
    private void saveData() {

        fileManager.saveGuest(guestRepository);

        fileManager.saveRooms(roomRepository);
    }

    private void loadData() {

        fileManager.loadGuests(guestRepository);

        fileManager.loadRooms(roomRepository);
    }

    //====================
    //OOP Demonstration
    //====================
    private void demonstrateOOP() {
        System.out.println();
        System.out.println("==== OOP Demonstration ====");
        /*
         * Polymorphism
         */
        Person person1 = new Guest(999, "Demo Guest", "guest@test.com", "09123456789");

        Person person2 = new Employee(1000, "Demo Employee", "employee@test.com", "0911111111", "Manager", 50000);

        person1.displayInfo();
        person2.displayInfo();

        /*
         * Inner class demonstration
         */
        Room room = new Room(999, RoomType.DELUXE, 5000, true);

        Room.RoomDetails details = room.new RoomDetails(9, "Ocean");

        details.displayDetails();

        /*
         * Anonymous class
         */
        Runnable anonymousExample = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class is running.");
            }
        };
        anonymousExample.run();

        /*
         * Record
         */

        GuestSummary summary = new GuestSummary(1, "John Doe", "john@email.com");

        System.out.println("Record: " + summary);
    }

    //===============
    //Generic Demonstration
    //===============
    private void demonstrateGenerics() {

        GenericRepository<String> stringRepository = new GenericRepository<>();

        stringRepository.add("Hotel");
        stringRepository.add("Management");
        stringRepository.add("System");

        System.out.println(stringRepository.getAll());

        GenericRepository<Guest> guestGenericRepository = new GenericRepository<>();

        Guest guest = new Guest(500, "Generic Guest", "generic@test.com", "09999999999");

        guestGenericRepository.add(guest);

        System.out.println(guestGenericRepository.getAll());

        /*
         * Generic instance method
         */
        stringRepository.print("Hello Generics");
        stringRepository.print(1234);


        /*
         * Generic static method
         */
        List<String> names = List.of("John", "Mary", "David");

        String first = GenericRepository.getFirst(names);
        System.out.println("First name: " + first);

        /*
         * Generic Pair
         */

        Pair<Integer, String> pair = new Pair<>(101, "Room 101");

        System.out.println("Pair: " + pair);

    }
}
