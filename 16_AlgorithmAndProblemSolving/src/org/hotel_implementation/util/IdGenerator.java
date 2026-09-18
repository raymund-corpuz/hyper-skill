package org.hotel_implementation.util;

public class IdGenerator {
    private static int guestCounter = 6;
    private static int reservationCounter = 6;

    public static String generateGuestId() {
        return String.format("G%3d", guestCounter++);
    }

    public static String generateReservationId() {
        return String.format("RES%03d", reservationCounter++);
    }
}
