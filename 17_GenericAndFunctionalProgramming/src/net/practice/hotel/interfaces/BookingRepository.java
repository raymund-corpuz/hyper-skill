package net.practice.hotel.interfaces;

import net.practice.hotel.model.Booking;

import java.time.LocalDate;
import java.util.List;

public interface BookingRepository extends Repository<Booking, String> {

    List<Booking> findByGuest(String guestId);

    List<Booking> findByRoomId(String roomId);

    List<Booking> findByDate(LocalDate date);
}
