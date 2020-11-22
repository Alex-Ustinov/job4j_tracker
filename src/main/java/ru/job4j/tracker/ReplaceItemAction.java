package ru.job4j.tracker;

public class ReplaceItemAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int idItem = input.askInt("Enter id:");
        String itemName = input.askStr("Enter item name:");
        Item editItem = new Item();
        editItem.setName(itemName);
        boolean res = tracker.replace(idItem, editItem);
        if (res) {
            System.out.println("Item was changed successfully");
        } else {
            System.out.println("Something went wrong");
        }
        return res;
    }
}
