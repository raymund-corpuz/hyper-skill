package hyperskill.hotel.management.interfaces;

import hyperskill.hotel.management.model.Booking;


import java.time.LocalDate;
import java.util.List;


public interface BookingRepository extends Repository<Booking, String> {

    List<Booking> findByGuest(String guestId);

    List<Booking> findByRoomId(String roomId);

    List<Booking> findByDate(LocalDate date);

}

