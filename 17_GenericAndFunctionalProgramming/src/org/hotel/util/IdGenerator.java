package org.hotel.util;

public class IdGenerator {
    private static int guestCounter = 6;
    private static int resCounter = 6;


    public String generateGuestId() {

        return String.format("G%03d", guestCounter++);
    }

    public String generateReservationId() {

        return String.format("RES%03d", resCounter++);
    }
}
