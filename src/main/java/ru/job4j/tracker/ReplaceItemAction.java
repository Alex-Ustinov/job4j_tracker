package ru.job4j.tracker;

public class ReplaceItemAction implements UserAction {

    private final Output out;

    ReplaceItemAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        int idItem = input.askInt("Enter id:");
        String itemName = input.askStr("Enter item name:");
        Item editItem = new Item();
        editItem.setName(itemName);
        boolean res = tracker.replace(idItem, editItem);
        if (res) {
            out.println("Item was changed successfully");
        } else {
            out.println("Something went wrong");
        }
        return res;
    }
}
