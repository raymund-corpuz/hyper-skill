package org.simple_hop.hotel.util;

public class IdGenerator {
    private static int guestIdCounter = 0;
    private static int bookingIdCounter = 0;

    private IdGenerator() {
        // empty code..
    }

    public static int guestIdGenerator() {
        return ++guestIdCounter;
    }

    public static int bookingIdGenerator() {
        return ++bookingIdCounter;
    }
}
