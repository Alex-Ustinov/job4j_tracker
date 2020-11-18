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
        if (indexOldItem != -1) {
            this.items[indexOldItem] = item;
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        int indexDeletedItem = indexOf(id);
        if(indexDeletedItem != -1) {
            System.out.println(indexDeletedItem);
            int nextDeleteItem = indexDeletedItem + 1;
            for (int i = indexDeletedItem; i < this.items.length; i++) {
                System.out.println(this.items[i].getName());
                this.items[i] = findById(nextDeleteItem);
            }
            return true;
        }

        for (int y = 0; y < this.items.length; y++) {
            if(this.items[y] != null) {
                //System.out.println(this.items[y].getName());
            }
        }

        return false;
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