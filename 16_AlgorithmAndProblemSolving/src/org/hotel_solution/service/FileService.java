package org.hotel_solution.service;

import org.hotel_solution.model.Guest;
import org.hotel_solution.model.Reservation;
import org.hotel_solution.model.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    public void saveGuests(List<Guest> guests) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/guest.txt"))) {

            for (Guest guest : guests) {
                writer.write(guest.getId() + "|" + guest.getName() + "|" +
                        guest.getPhone() + "|" + guest.getEmail());
                writer.newLine();
            }
        }
    }

    public List<Guest> loadGuest() throws IOException {

        List<Guest> guests = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("data/guests.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) {
                    continue;
                }

                String[] parts = line.split("\\|");

                if (parts.length >= 4) {

                    Guest guest = new Guest(parts[0], parts[1], parts[2], parts[3]);

                    guests.add(guest);
                }
            }
        }
        return guests;
    }


    public void saveRooms(List<Room> rooms) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/rooms.txt"))) {

            for (Room room : rooms) {

                writer.write(room.getRoomNumber() + "|" + room.getRoomType() +
                        room.getPrice() + "|" + room.isAvailable());

                writer.newLine();
            }
        }
    }

    public List<Room> loadRooms() throws IOException {

        List<Room> rooms = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("data/rooms.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                if (line.isBlank()) {
                    continue;
                }

                String[] parts = line.split("\\|");

                if (parts.length >= 4) {
                    Room room = new Room(parts[0], parts[1], Double.parseDouble(parts[2]), Boolean.parseBoolean(parts[3]));

                    rooms.add(room);
                }
            }
        }

        return rooms;
    }

    public void saveReservations(List<Reservation> reservations) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/reservations.txt"))) {

            for (Reservation reservation : reservations) {
                writer.write(reservation.getId() + "|" + reservation.getGuest().getId() +
                        reservation.getRoom().getRoomNumber() + "|" + reservation.getNights() + "|" +
                        reservation.getStatus());
                writer.newLine();
            }

        }
    }
}
