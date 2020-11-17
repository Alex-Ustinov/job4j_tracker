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
        int oldId = findById(id).getId();
        item.setId(oldId);
        if (indexOldItem != -1) {
            this.items[indexOldItem] = item;
            return true;
        }
        return false;
    }

    public Item[] findAll() {
        Item[] withOutNull = new Item[this.items.length];
        int size = 0;
        for (Item item : this.items) {
            if (item != null) {
                withOutNull[size] = item;
                size++;
            }
        }
        withOutNull = Arrays.copyOf(withOutNull, size);
        return withOutNull;
    }

    public Item[] findByName(String key) {
        Item[] resultSearch = new Item[this.items.length];
        int size = 0;
        for(Item item : this.items) {
            if(item.getName().equals(key)) {
                resultSearch[size] = item;
                size++;
            }
        }
        return resultSearch;
    }
}