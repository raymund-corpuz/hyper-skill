package org.simple.hotel.record;

import org.simple.hotel.model.BookingStatus;
import org.simple.hotel.model.RoomType;

public record BookingRecord(String bookingId, String guestId, String roomId, RoomType roomType, BookingStatus status) {
}
