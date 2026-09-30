package org.simple_solution.hotel.repository;

import org.simple_solution.hotel.interfaces.Searchable;
import org.simple_solution.hotel.model.Booking;

import java.util.LinkedList;

public class BookingRepository implements Searchable {

    private final LinkedList<Booking> bookings = new LinkedList<>();

    public void add(Booking booking) {
        bookings.add(booking);
    }

    public void remove(Booking booking) {
        bookings.remove(booking);
    }

    @Override
    public Booking searchById(int id) {

        for (Booking booking : bookings) {
            if (booking.getBookingId() == id) {
                return booking;
            }
        }

        return null;
    }

    public LinkedList<Booking> getAll() {
        return new LinkedList<>(bookings);
    }
}
