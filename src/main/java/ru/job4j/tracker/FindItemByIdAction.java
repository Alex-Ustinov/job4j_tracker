package ru.job4j.tracker;

public class FindItemByIdAction implements UserAction {

    private final Output out;

    public FindItemByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int idItem = input.askInt("Enter id:");
        Item foundItem = tracker.findById(idItem);
        if (foundItem != null) {
            out.println(foundItem);
        }
        return true;
    }
}
