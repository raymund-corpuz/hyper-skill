package org.hotel_implementation.service;


import org.hotel_implementation.enums.ReservationStatus;
import org.hotel_implementation.model.Guest;
import org.hotel_implementation.model.Reservation;
import org.hotel_implementation.model.Room;
import org.hotel_implementation.exception.InvalidReservationException;
import org.hotel_implementation.record.ReservationRecord;

import java.io.IOException;
import java.util.*;

import static org.hotel_implementation.util.IdGenerator.generateGuestId;
import static org.hotel_implementation.util.IdGenerator.generateReservationId;

public class ReservationService {

    List<Reservation> reservations = new ArrayList<>();
    LinkedList<Reservation> reservationQueues = new LinkedList<>();

    //create reservation
    public Reservation createReservation(Guest guest, Room room, int night) throws InvalidReservationException {

        if (guest == null || room == null) {
            throw new InvalidReservationException("Guest / Room is empty.❌");
        }

        if (!room.isAvailable()) {
            throw new InvalidReservationException("Room is occupied.❌");
        }

        if (night <= 0) {
            throw new InvalidReservationException("Night must be greater than zero.❌");
        }

        Reservation reservation = new Reservation(generateReservationId(), guest, room, night);

        reservations.add(reservation);

        reservationQueues.addLast(reservation);
        room.setAvailable(false);

        return reservation;
    }

    //cancel reservation
    public void cancelReservation(String id) throws IOException {
        Reservation reservation = findReservation(id);

        if (reservation.getStatus().equals(ReservationStatus.CANCELLED)) {
            throw new InvalidReservationException("Reservation is already cancelled.");
        }

        if (reservation.getStatus().equals(ReservationStatus.COMPLETED)) {
            throw new InvalidReservationException("Complete reservation cannot be cancelled");
        }

        reservation.cancel();
        System.out.println("Reservation is cancelled.✅");
    }

    //find reservation
    public Reservation findReservation(String id) throws InvalidReservationException {

        for (Reservation reservation : reservations) {
            if (reservation.getId().equalsIgnoreCase(id)) {
                return reservation;
            }
        }
        throw new InvalidReservationException("Reservation not found." + id);
    }

    //process reservation queue
    public void reservationOnQueue(Reservation reservation) {
        System.out.println("==== Process Reservation ====");
        System.out.println("ID : " + reservation.getId());
        System.out.println("Name: " + reservation.getGuest().getName());
        System.out.println("Room Number: " + reservation.getRoom().getRoomNumber());
        System.out.println("Night: " + reservation.getNights());
        System.out.println("Total : " + reservation.calculateTotal());
    }

    //processNextReservation
    public Reservation processNextReservation() {
        if (reservations.isEmpty()) {
            return null;
        }

        return reservationQueues.removeFirst();
    }

    //generate report
    public Map<String, Integer> generateReport() {
        Map<String, Integer> report = new LinkedHashMap<>();

        for (Reservation reservation : reservations) {
            String status = reservation.getStatus().name();

            report.merge(status, 1, Integer::sum);
        }

        return report;
    }


    //create reservation record
    public ReservationRecord createReservationRecord(Reservation reservation) {
        return new ReservationRecord(reservation.getId(),
                reservation.getGuest().getName(), reservation.getRoom().getRoomNumber(), reservation.calculateTotal(), reservation.getStatus().name());
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public LinkedList<Reservation> getReservationQueues() {
        return reservationQueues;
    }
}
