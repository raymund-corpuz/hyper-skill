package org.simple_solution.hotel.util;

public class IdGenerator {

    public static int guestId = 1;
    public static int bookingId = 1001;

    private IdGenerator() {
        // Prevent object creation.
    }

    public static int nextGuestId() {
        return guestId++;
    }

    public static int nextBookingId() {
        return bookingId++;
    }
}
