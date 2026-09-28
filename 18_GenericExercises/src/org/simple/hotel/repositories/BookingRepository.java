package org.simple.hotel.repositories;

import org.simple.hotel.model.Booking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BookingRepository {

    List<Booking> bookings = new ArrayList<>();
    LinkedList<Booking> bookingLinkedList = new LinkedList<>();

    public void addBooking(Booking booking) {

        System.out.println("Successfully added: " + booking.getBookingId());
        bookings.add(booking);
        bookingLinkedList.addLast(booking);
    }

    public void removeBooking(Booking booking) {

        System.out.println("Successfully remove: " + booking.getBookingId());
        bookings.remove(booking);
        bookingLinkedList.remove(booking);
    }

    public Booking findBooking(String bookingId) {

        for (Booking booking : bookings) {
            if (booking.matches(bookingId)) {
                return booking;
            }
        }
        System.out.println("Booking ID not found.");
        return null;
    }

    public void displayHistory() {

        if (bookingLinkedList.isEmpty()) {
            System.out.println("No found booking: ");
            return;
        }

        for (Booking booking : bookingLinkedList) {
            booking.displayInfo();
        }

    }
}
