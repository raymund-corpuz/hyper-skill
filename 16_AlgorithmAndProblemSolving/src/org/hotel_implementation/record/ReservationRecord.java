package org.hotel_implementation.record;

public record ReservationRecord(String reservationId, String guestName, String roomNumber, double total,
                                String status) {
}
