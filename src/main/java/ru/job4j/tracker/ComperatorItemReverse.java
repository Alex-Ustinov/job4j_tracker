package ru.job4j.tracker;

import java.util.Comparator;

public class ComperatorItemReverse implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        return b.getName().compareTo(a.getName());
    }
}
