package hyperskill.hotel.management.interfaces;

import java.util.Optional;

public interface Service<T, ID> {

    T create(T entity);

    Optional<T> findById(ID id);

    T update(ID id);

    void delete(ID id);
}
