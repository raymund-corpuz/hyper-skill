package net.practice.hotel.interfaces;

import net.practice.hotel.model.Guest;

import java.util.List;
import java.util.Optional;

public interface GuestRepository extends Repository<Guest, String> {

    Optional<Guest> findByEmail(String email);

    List<Guest> findByName(String name);
}
