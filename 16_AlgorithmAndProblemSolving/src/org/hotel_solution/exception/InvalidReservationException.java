package org.hotel_solution.exception;

public class InvalidReservationException extends RuntimeException {
    public InvalidReservationException(String message) {
        super(message);
    }
}
