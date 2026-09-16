package org.hotel_solution.records;

public record ReservationRecord(String reservationId, String guestName, String roomNumber, double total,
                                String status) {
}
