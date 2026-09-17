package org.hotel_solution.service;

import org.hotel.enums.ReservationStatus;
import org.hotel_solution.exception.InvalidReservationException;
import org.hotel_solution.model.Guest;
import org.hotel_solution.model.Reservation;
import org.hotel_solution.model.Room;
import org.hotel_solution.records.ReservationRecord;

import java.io.IOException;
import java.util.*;

public class ReservationService {
    private final List<Reservation> reservations = new ArrayList<>();
    private final LinkedList<Reservation> reservationQueue = new LinkedList<>();

    public Reservation createReservation(String id, Guest guest, Room room, int nights) throws InvalidReservationException {

        if (guest == null) {
            throw new InvalidReservationException("Guest is required.");
        }

        if (room == null) {
            throw new InvalidReservationException("Room is required.");
        }

        if (!room.isAvailable()) {
            throw new InvalidReservationException("Room is occupied.");
        }

        if (nights <= 0) {
            throw new InvalidReservationException("Night must be greater than zero.");
        }

        Reservation reservation = new Reservation(id, guest, room, nights);
        reservations.add(reservation);

        reservationQueue.addLast(reservation);
        room.setAvailable(false);

        return reservation;
    }

    public void cancelReservation(String id) throws IOException {

        Reservation reservation = findReservation(id);

        if (reservation.getStatus() == ReservationStatus.CANCELLED) {
            throw new InvalidReservationException("Reservation is already cancelled.");
        }

        if (reservation.getStatus() == ReservationStatus.COMPLETED) {
            throw new InvalidReservationException("Completed reservation cannot be cancelled.");
        }

        reservation.cancel();
        System.out.println("Reservation cancelled.");
    }

    public Reservation findReservation(String id) throws InvalidReservationException {

        for (Reservation reservation : reservations) {
            if (reservation.getId().equalsIgnoreCase(id)) {
                return reservation;
            }
        }
        throw new InvalidReservationException("Reservation not found: " + id);
    }

    public Reservation processNextReservation() {

        if (reservations.isEmpty()) {
            return null;
        }

        return reservationQueue.removeFirst();
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public LinkedList<Reservation> getReservationQueue() {
        return reservationQueue;
    }


    /*
     * LINKEDHASHMAP
     */

    public Map<String, Integer> generateStatusReport() {

        Map<String, Integer> report = new LinkedHashMap<>();

        for (Reservation reservation : reservations) {

            String status = reservation.getStatus().name();

            report.merge(status, 1, Integer::sum);
        }

        return report;
    }

    public ReservationRecord createRecord(Reservation reservation) {

        return new ReservationRecord(reservation.getId(), reservation.getGuest().getName(), reservation.getRoom().getRoomNumber(),
                reservation.calculateTotal(), reservation.getStatus().name());
    }
}
