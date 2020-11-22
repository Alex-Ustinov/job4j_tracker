package ru.job4j.tracker;

public class FindItemByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find items by nam";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String nameItem = input.askStr("Enter name item:");
        Item [] items  = tracker.findByName(nameItem);
        boolean rsl = items.length > 0;
        if (rsl) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с таким именем не найдены");
        }
        return rsl;
    }
}
