package org.hotel.records;

import org.hotel.enums.ReservationStatus;

public record ReservationRecord(String reservationId, String name, String roomNumber, double total,
                                String status) {
}
