package ru.job4j.tracker;

import java.util.ArrayList;

public class ShowAllItemsAction implements UserAction {

    private final Output out;

    ShowAllItemsAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        ArrayList<Item> items = tracker.findAll();
        for (Item item : items) {
             out.println(item);
        }
        return true;
    }
}
