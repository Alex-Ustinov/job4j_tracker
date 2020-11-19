package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? this.items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int indexOldItem = indexOf(id);
        item.setId(id);
        boolean rsl = indexOldItem != -1;
        if (rsl) {
            this.items[indexOldItem] = item;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int indexDeletedItem = indexOf(id);
        boolean rsl = indexDeletedItem != -1;
        if (rsl) {
            System.arraycopy(this.items, indexDeletedItem + 1, this.items, indexDeletedItem, size - indexDeletedItem);
            this.items[size - 1] = null;
            size--;
        }
        return rsl;
        /*
        if(rsl) {
            for(int i = indexDeletedItem; i < size - indexDeletedItem + 1; i++) {
                this.items[i] = this.items[i + 1];
            }
            size--;
        }
         */
    }


    public Item[] findAll() {
        return Arrays.copyOf(this.items, size);
    }

    public Item[] findByName(String key) {
        Item[] resultSearch = new Item[this.size];
        int count = 0;
        for(Item item : this.items) {
            if(item.getName().equals(key)) {
                resultSearch[count] = item;
                count++;
            }
        }
        return resultSearch;
    }
}