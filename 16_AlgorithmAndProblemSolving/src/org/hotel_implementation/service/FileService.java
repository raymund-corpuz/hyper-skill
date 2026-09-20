package org.hotel_implementation.service;

import org.hotel.model.Guest;
import org.hotel_implementation.model.Reservation;
import org.hotel_implementation.model.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    //saveGuest
    public void saveGuest(List<Guest> guests) throws IOException {
        ;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/guest.txt"))) {

            for (Guest guest : guests) {
                writer.write(guest.getId() + "|" + guest.getName() + "|" + guest.getPhone());
                writer.newLine();
            }
        }

    }

    //loadGuest
    public List<Guest> loadGuest() throws IOException {
        List<Guest> guests = new ArrayList<>();

        while (true) {
            try (BufferedReader reader = new BufferedReader(new FileReader("data/guest.txt"))) {

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

    }

    //saveRooms
    public void saveRooms(List<Room> rooms) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/rooms.txt"))) {
            for (Room room : rooms) {
                writer.write(room.getRoomNumber() + "|" + room.getRoomType() + "|" + room.getPrice());
                writer.newLine();
            }
        }
    }

    //loadRooms
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

    //save reservation
    public void saveReservation(List<Reservation> reservations) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/reservation.txt"))) {
            for (Reservation reservation : reservations) {
                writer.write(reservation.getId() + "|" + reservation.getGuest().getName() + "|" + reservation.getRoom().getRoomNumber() + "|" + reservation.calculateTotal());
                writer.newLine();
            }
        }
    }
}
