package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class MemTracker {
    private final ArrayList<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? this.items.get(index) : null;
    }

    public boolean replace(int id, Item item) {
        int indexOldItem = indexOf(id);
        item.setId(id);
        boolean rsl = indexOldItem != -1;
        if (rsl) {
            this.items.set(indexOldItem, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int indexDeletedItem = indexOf(id);
        boolean rsl = indexDeletedItem != -1;
        if (rsl) {
            this.items.remove(indexDeletedItem);
        }
        return rsl;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> resultSearch = new ArrayList<>();
        for (Item item : this.items) {
            if (item.getName().equals(key)) {
                resultSearch.add(item);
            }

        }
        return resultSearch;
    }
}