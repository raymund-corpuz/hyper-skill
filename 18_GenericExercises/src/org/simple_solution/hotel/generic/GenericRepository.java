package org.simple_solution.hotel.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericRepository<T> {

    private final ArrayList<T> items = new ArrayList<>();

    public void add(T item) {

        items.add(item);
    }

    public void remove(T item) {

        items.remove(item);
    }

    public T get(int index) {

        return items.get(index);
    }

    public ArrayList<T> getAll() {

        return new ArrayList<>(items);
    }

    public int size() {

        return items.size();
    }

    /*
     * Instance generic method
     */

    public <E> void print(E value) {
        System.out.println("Generic value: " + value);
    }

    /*
     * Static generic method
     */

    public static <E> E getFirst(List<E> list) {

        if (list == null || list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }


}
