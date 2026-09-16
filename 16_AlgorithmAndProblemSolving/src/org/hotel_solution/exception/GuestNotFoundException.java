package org.hotel_solution.exception;

public class GuestNotFoundException extends RuntimeException {
    public GuestNotFoundException(String message) {
        super(message);
    }
}
