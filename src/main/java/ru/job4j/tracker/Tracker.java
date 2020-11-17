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

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
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