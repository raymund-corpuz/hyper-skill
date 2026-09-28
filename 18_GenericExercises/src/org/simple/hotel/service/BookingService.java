package org.simple.hotel.service;

import org.simple.hotel.model.Booking;
import org.simple.hotel.model.Guest;
import org.simple.hotel.model.Room;
import org.simple.hotel.record.BookingRecord;
import org.simple.hotel.repositories.BookingRepository;
import org.simple.hotel.repositories.GuestRepository;
import org.simple.hotel.repositories.RoomRepository;

public class BookingService {

    GuestRepository guestRepository = new GuestRepository();
    RoomRepository roomRepository = new RoomRepository();
    BookingRepository bookingRepository = new BookingRepository();
    BookingRecord bookingRecord = null;

    public void createBooking(Booking booking) {
        System.out.println();
        Guest guest = guestRepository.findGuest(booking.getGuest().getId());
        Room room = roomRepository.findRoom(booking.getRoom().getRoomNumber());

        if (!room.isAvailable()) {
            System.out.println("Room is not available.");
            return;
        }

        booking.getRoom().setAvailable(false);
        bookingRepository.addBooking(booking);

        bookingRecord = new BookingRecord(booking.getBookingId(), booking.getGuest().getId(), booking.getRoom().getRoomNumber(),
                booking.getRoom().getRoomType(), booking.getStatus());

    }

    public void cancelBooking(Booking booking) {
        Booking foundBooking = bookingRepository.findBooking(booking.getBookingId());

        bookingRepository.removeBooking(foundBooking);
    }

    public void findBooking(Booking booking) {
        Booking foundBooking = bookingRepository.findBooking(booking.getBookingId());

        foundBooking.displayInfo();
    }

    public void displayBookings() {
        bookingRepository.displayHistory();
    }
}
