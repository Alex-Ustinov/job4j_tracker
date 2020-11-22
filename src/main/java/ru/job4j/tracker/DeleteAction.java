package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int idItem = input.askInt("Enter id:");
        boolean res = tracker.delete(idItem);
        if (res) {
            System.out.println("Item was deleted successfully");
        } else {
            System.out.println("Something went wrong");
        }
        return res;
    }
}
