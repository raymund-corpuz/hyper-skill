package net.practice.hotel.interfaces;

import java.util.Optional;

public interface Service<T, ID> {

    void create(T entity);

    Optional<T> findById(ID id);

    T update(T entity, ID id);

    void delete(ID id);


}
