package org.simple_hop.hotel.repository;

import org.simple_hop.hotel.generic.GenericRepository;
import org.simple_hop.hotel.model.Booking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BookingRepository extends GenericRepository<Booking, Integer> {
    ArrayList<Booking> bookings = new ArrayList<>();
    Map<Integer, Booking> bookingMap = new HashMap<>();

    public void add(Booking booking) {

        bookings.add(booking);
        bookingMap.put(booking.getBookingId(), booking);

        System.out.println("Booking Added.✅");
    }

    public Booking find(int bookingId) {

        for (Booking booking : bookings) {
            if (booking.getBookingId() == bookingId) {
                return booking;
            }
        }

        return null;
    }

    public void remove(Booking booking) {

        bookings.remove(booking);
        bookingMap.remove(booking.getBookingId(), booking);
    }

    public ArrayList<Booking> getAll() {
        return new ArrayList<>(bookings);
    }
}
