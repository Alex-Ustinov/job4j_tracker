package ru.job4j.tracker;

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
    public boolean execute(Input input, Tracker tracker) {
        String nameItem = input.askStr("Enter name item:");
        Item [] items  = tracker.findByName(nameItem);
        boolean rsl = items.length > 0;
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
