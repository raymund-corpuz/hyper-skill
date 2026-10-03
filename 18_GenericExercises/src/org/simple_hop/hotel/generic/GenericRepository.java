package org.simple_hop.hotel.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericRepository<T, ID> {

    ArrayList<T> items = new ArrayList<>();

    public void add(T entity) {
        items.add(entity);
    }

    public void remove(T entity) {
        items.remove(entity);
    }

    public T find(int index) {
        return items.get(index);
    }

    public List<T> getAll() {
        return items;
    }

}
