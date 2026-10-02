package org.simple_solution.hotel.file;

import org.simple.hotel.model.RoomType;
import org.simple_solution.hotel.model.Guest;
import org.simple_solution.hotel.model.Room;
import org.simple_solution.hotel.repository.GuestRepository;
import org.simple_solution.hotel.repository.RoomRepository;

import java.io.*;

public class FileManager {

    private static final String FILE_NAME = "C:\\Users\\raymu\\OneDrive\\Desktop\\hyper-skill\\18_GenericExercises\\src\\org\\simple_solution\\hotel\\hotel-data.txt";

    public void saveGuest(GuestRepository repository) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Guest guest : repository.getAll()) {

                writer.write("GUEST|" + guest.getId() + "|" +
                        guest.getName() + "|" + guest.getEmail() + "|" +
                        guest.getPhone() + "|" + guest.getNumberOfBookings());
                writer.newLine();
            }
            System.out.println("Guest data saved.");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public void loadGuests(GuestRepository repository) {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split("\\|");

                if (parts.length != 6) {
                    continue;
                }

                if (!parts[0].equals("GUEST")) {
                    continue;
                }

                int id = Integer.parseInt(parts[1]);

                String name = parts[2];
                String email = parts[3];
                String phone = parts[4];

                int bookings = Integer.parseInt(parts[5]);

                Guest guest = new Guest(id, name, email, phone, bookings);

                repository.add(guest);
            }
            System.out.println("Guest data loaded.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void saveRooms(RoomRepository repository) {

        File file = new File("C:\\Users\\raymu\\OneDrive\\Desktop\\hyper-skill\\18_GenericExercises\\src\\org\\simple_solution\\hotel\\rooms-data.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            for (Room room : repository.getRooms()) {
                writer.write(room.getRoomNumber() + "|" +
                        room.getRoomType() + "|" +
                        room.getPrice() + "|" +
                        room.isAvailable());
                writer.newLine();
            }
            System.out.println("Room data saved.");
        } catch (IOException e) {

            System.out.println("Error writing rooms: " + e.getMessage());
        }
    }

    public void loadRooms(RoomRepository repository) {

        File file = new File("C:\\Users\\raymu\\OneDrive\\Desktop\\hyper-skill\\18_GenericExercises\\src\\org\\simple_solution\\hotel\\rooms-data.txt");

        if (!file.exists()) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split("\\|");

                if (parts.length != 4) {
                    continue;
                }

                int roomNumber = Integer.parseInt(parts[0]);
                RoomType roomType = RoomType.valueOf(parts[1]);
                double price = Double.parseDouble(parts[2]);
                boolean available = Boolean.parseBoolean(parts[3]);

                Room room = new Room(roomNumber, roomType, price, available);

                repository.addRoom(room);
            }
            System.out.println("Room data loaded.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
