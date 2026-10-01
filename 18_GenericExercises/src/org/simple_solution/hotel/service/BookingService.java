package org.simple_solution.hotel.service;

import org.simple_solution.hotel.exception.BookingNotFoundException;
import org.simple_solution.hotel.exception.GuestNotFoundException;
import org.simple_solution.hotel.exception.RoomNotAvailableException;
import org.simple_solution.hotel.model.Booking;
import org.simple_solution.hotel.model.Guest;
import org.simple_solution.hotel.model.Room;
import org.simple_solution.hotel.repository.BookingRepository;

import java.util.LinkedList;

public class BookingService {

    private final BookingRepository bookingRepository;
    private final GuestService guestService;
    private final RoomService roomService;

    public BookingService(
            BookingRepository bookingRepository,
            GuestService guestService,
            RoomService roomService
    ) {
        this.bookingRepository = bookingRepository;
        this.guestService = guestService;
        this.roomService = roomService;
    }

    public Booking createBooking(
            int bookingId,
            int guestId,
            int roomNumber,
            String checkIn,
            String checkOut
    )
            throws GuestNotFoundException,
            RoomNotAvailableException {

        Guest guest =
                guestService.findGuest(guestId);

        Room room =
                roomService.findRoom(roomNumber);

        if (room == null) {
            throw new RoomNotAvailableException(
                    "Room does not exist."
            );
        }

        if (!room.isAvailable()) {
            throw new RoomNotAvailableException(
                    "Room " + roomNumber +
                            " is currently occupied."
            );
        }

        Booking booking = new Booking(
                bookingId,
                guest,
                room,
                checkIn,
                checkOut
        );

        booking.book();

        guest.incrementBooking();

        bookingRepository.add(booking);

        return booking;
    }

    public void cancelBooking(int bookingId)
            throws BookingNotFoundException {

        Booking booking =
                bookingRepository.searchById(bookingId);

        if (booking == null) {
            throw new BookingNotFoundException(
                    "Booking with ID "
                            + bookingId
                            + " was not found."
            );
        }

        booking.cancel();

        booking.getGuest().decrementBooking();

        bookingRepository.remove(booking);

        System.out.println("Booking cancelled.");
    }

    public Booking findBooking(int bookingId)
            throws BookingNotFoundException {

        Booking booking =
                bookingRepository.searchById(bookingId);

        if (booking == null) {
            throw new BookingNotFoundException(
                    "Booking with ID "
                            + bookingId
                            + " was not found."
            );
        }

        return booking;
    }

    public void displayBookings() {

        LinkedList<Booking> bookings =
                bookingRepository.getAll();

        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }

        bookings.forEach(Booking::displayInfo);
    }
}
