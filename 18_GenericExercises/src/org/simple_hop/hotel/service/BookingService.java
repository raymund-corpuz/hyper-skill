package org.simple_hop.hotel.service;

import org.simple_hop.hotel.exception.BookingNotFoundException;
import org.simple_hop.hotel.model.Booking;
import org.simple_hop.hotel.repository.BookingRepository;
import org.simple_hop.hotel.repository.GuestRepository;
import org.simple_hop.hotel.repository.RoomRepository;


public class BookingService {

    private final BookingRepository bookingRepository;
    private final GuestRepository guestRepositiory;
    private final RoomRepository roomRepository;

    public BookingService(BookingRepository bookingRepository, GuestRepository guestRepository, RoomRepository roomRepository) {
        this.bookingRepository = bookingRepository;
        this.guestRepositiory = guestRepository;
        this.roomRepository = roomRepository;
    }

    
}
