package ru.job4j.tracker;

import java.util.List;

public class FindItemByNameAction implements UserAction {

    private final Output out;

    FindItemByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        String nameItem = input.askStr("Enter name item:");
        List<Item> items  = tracker.findByName(nameItem);
        boolean rsl = items.size() > 0;
        if (rsl) {
            for (Item item : items) {
                 out.println(item);
            }
        } else {
             out.println("Заявки с таким именем не найдены");
        }
        return rsl;
    }
}
