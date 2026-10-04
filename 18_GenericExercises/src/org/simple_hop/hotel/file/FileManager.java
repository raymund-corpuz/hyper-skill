package org.simple_hop.hotel.file;

import org.simple_hop.hotel.model.Guest;
import org.simple_hop.hotel.repository.GuestRepository;

import java.io.*;

public class FileManager {
    private static final String FILE_NAME = "C:\\Users\\raymu\\OneDrive\\Desktop\\hyper-skill\\18_GenericExercises\\src\\org\\simple_hop\\hotel\\data";

    public void saveGuest(GuestRepository guestRepository) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Guest guest : guestRepository.getAll()) {
                writer.write("GUEST |" + guest.getId() + "|" + guest.getName() + "|" + guest.getEmail() + "|" + guest.getPhone());
                writer.newLine();
            }
            System.out.println("Guest data saved.");

        } catch (IOException e) {
            throw new IOException("Error saving the file.❌");
        }
    }

    public void loadGuests(GuestRepository guestRepository) throws IOException {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
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
                int nightsToStay = Integer.parseInt(parts[5]);

                Guest guest = new Guest(id, name, email, phone, nightsToStay);

                guestRepository.add(guest);
            }

        } catch (IOException e) {

        }
    }
}
