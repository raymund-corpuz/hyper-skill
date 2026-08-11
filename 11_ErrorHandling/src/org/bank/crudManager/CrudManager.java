package org.bank.crudManager;

import java.util.ArrayList;
import java.util.List;

public class CrudManager<T> {
    private List<T> items;

    public CrudManager() {
        items = new ArrayList<>();
    }

    //CREATE
    public void add(T item) {
        items.add(item);
    }

    //READ
    public List<T> getAll() {
        return items;
    }

    public T get(int index) {
        if (index < 0 || index > items.size()) {
            return null;
        }

        return items.get(index);
    }

    //UPDATE
    public boolean update(int index, T item) {
        if (index < 0 || index >= items.size()) {
            return false;
        }

        items.set(index, item);
        return true;
    }

    //DELETE
    public boolean delete(int index) {
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
