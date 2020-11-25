package ru.job4j.tracker;

public class DeleteAction implements UserAction {

    private final Output out;

    DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int idItem = input.askInt("Enter id:");
        boolean res = tracker.delete(idItem);
        if (res) {
            out.println("Item was deleted successfully");
        } else {
            out.println("Something went wrong");
        }
        return res;
    }
}
