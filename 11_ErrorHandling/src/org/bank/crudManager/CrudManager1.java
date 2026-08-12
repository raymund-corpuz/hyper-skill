package org.bank.crudManager;

import java.util.ArrayList;
import java.util.List;

public class CrudManager1<T> {
    private List<T> items;

    //constructor
    public CrudManager1() {
        items = new ArrayList<>();
    }

    //Create
    public void add(T item) {
        items.add(item);
    }

    //Read
    public List<T> getAll(T item) {
        return items;
    }

    public T get(int index) {
        if (index < 0 || index >= items.size()) {
            return null;
        }

        return items.get(index);
    }

    //Update
    public boolean update(int index, T item) {
        if (index < 0 || index >= items.size()) {
            return false;
        }

        items.set(index, item);
        return true;
    }

    //Delete
    public boolean delete(int index, T item) {
        if (index < 0 || index >= items.size()) {
            return false;
        }

        items.remove(index);
        return true;
    }

    public int size() {
        return items.size();
    }
}