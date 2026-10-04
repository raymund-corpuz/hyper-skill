package org.simple_hop.hotel.service;

import org.simple_hop.hotel.exception.BookingNotFoundException;
import org.simple_hop.hotel.exception.GuestNotFoundException;
import org.simple_hop.hotel.exception.RoomNotAvailableException;
import org.simple_hop.hotel.model.Booking;
import org.simple_hop.hotel.model.Guest;
import org.simple_hop.hotel.model.Room;
import org.simple_hop.hotel.repository.BookingRepository;
import org.simple_hop.hotel.repository.GuestRepository;
import org.simple_hop.hotel.repository.RoomRepository;
import org.simple_hop.hotel.util.IdGenerator;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class BookingService {

    private final BookingRepository bookingRepository;
    private final GuestRepository guestRepositiory;
    private final RoomRepository roomRepository;

    public BookingService(BookingRepository bookingRepository, GuestRepository guestRepository, RoomRepository roomRepository) {
        this.bookingRepository = bookingRepository;
        this.guestRepositiory = guestRepository;
        this.roomRepository = roomRepository;
    }

    public Booking createBooking(int guestId, int roomNumber, String checkIn, String checkOut) throws RoomNotAvailableException, GuestNotFoundException {

        int bookingId = IdGenerator.bookingIdGenerator();

        Guest guest = guestRepositiory.get(guestId);

        Room room = roomRepository.get(roomNumber);

        Booking booking = new Booking(bookingId, guest, room, checkIn, checkOut);

        if (room == null) {
            throw new RoomNotAvailableException("Room number Not Found: " + roomNumber);
        }

        if (guest == null) {
            throw new GuestNotFoundException("Guest Id Not Found: " + guestId);
        }

        booking.book();
        bookingRepository.add(booking);
        System.out.println("Successfully added new booking.✅");

        return booking;
    }

    public void removeBooking(int bookingId) {

        Booking booking = findBooking(bookingId);

        booking.cancel();
        bookingRepository.remove(booking);
        System.out.println("Successfully remove booking: " + bookingId);
    }

    public Booking findBooking(int bookingId) throws BookingNotFoundException {

        Booking booking = bookingRepository.get(bookingId);

        if (booking == null) {
            throw new BookingNotFoundException("Booking Id not found: " + bookingId);
        }

        return booking;
    }

    public ArrayList<Booking> getAllBookings() {
        ArrayList<Booking> bookings = bookingRepository.getAll();

        if (bookings.isEmpty()) {
            System.out.println("Bookings not found.❌");
            return null;
        }

        bookings.forEach(Booking::displayInfo);

        return bookings;
    }


}
