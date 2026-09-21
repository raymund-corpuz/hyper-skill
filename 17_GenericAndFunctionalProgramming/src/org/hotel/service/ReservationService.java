package org.hotel.service;

import org.hotel.enums.ReservationStatus;
import org.hotel.exception.InvalidReservationException;
import org.hotel.model.Reservation;
import org.hotel.records.ReservationRecord;

import java.io.IOException;
import java.util.*;

public class ReservationService {
    private final List<Reservation> reservations = new ArrayList<>();
    private final LinkedList<Reservation> reservationQueue = new LinkedList<>();

    //createReservation()
    public Reservation createReservation(Reservation reservation) throws InvalidReservationException {

        if (reservation.getGuest() == null) {
            throw new InvalidReservationException("Guest not found.❌");
        }

        if (reservation.getRooms() == null) {
            throw new InvalidReservationException("Room not found.❌");
        }

        if (reservation.getNights() <= 0) {
            throw new InvalidReservationException("Nights must be greater than zero.");
        }

        if (!reservation.getRooms().isAvailable()) {
            throw new InvalidReservationException("Room is occupied.❌");
        }

        reservations.add(reservation);

        reservationQueue.addLast(reservation);
        reservation.getRooms().setAvailable(false);

        return reservation;

    }

    //cancelReservation
    public void cancelReservation(String id) throws InvalidReservationException {

        Reservation reservation = findReservation(id);

        if (reservation.getStatus() == ReservationStatus.CANCELLED) {
            throw new InvalidReservationException("Reservation is already cancelled.");
        }

        if (reservation.getStatus() == ReservationStatus.COMPLETED) {

            throw new InvalidReservationException("Complete Reservation cannot be cancel.");
        }

        reservation.setStatus(ReservationStatus.CANCELLED);
        System.out.println("Reservation cancelled.✅");

    }

    //findReservation()
    public Reservation findReservation(String id) {
        Reservation foundReservation = null;

        for (Reservation reservation : reservations) {
            if (reservation.getId().equalsIgnoreCase(id)) {
                foundReservation = reservation;
            }
        }
        return foundReservation;
    }

    //processNextReservation
    public Reservation processNextReservation() {

        if (reservationQueue.isEmpty()) {
            return null;
        }
        return reservationQueue.removeFirst();
    }

    //generateStatusReport()
    public Map<String, Integer> generateStatusReport() {

        Map<String, Integer> report = new LinkedHashMap<>();

        for (Reservation reservation : reservations) {
            String status = reservation.getStatus().name();

            report.merge(status, 1, Integer::sum);
        }
        return report;
    }

    //createReport()
    public Reservation createReport(Reservation reservation) {
        return new ReservationRecord(reservation.getId(), reservation.getGuest().getName(), reservation.getRooms().getRoomNumber(), reservation.calculateTotal(), reservation.getStatus().name());
    }
}
