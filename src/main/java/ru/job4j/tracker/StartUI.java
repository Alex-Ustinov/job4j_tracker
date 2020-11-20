package ru.job4j.tracker;

import ru.job4j.opp.ConsoleInput;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Choose an option"));
            if (select == 1 ) {
                Item [] items = tracker.findAll();
                for (Item item : items) {
                        System.out.println(item);
                }
            } else if (select == 2) {
                int idItem = Integer.valueOf(input.askStr("Enter id:"));
                String itemName = input.askStr("Enter item name:");
                Item editItem = new Item();
                editItem.setName(itemName);
                boolean res = tracker.replace(idItem, editItem);
                if (res) {
                    System.out.println("Item was changed successfully");
                } else {
                    System.out.println("Something went wrong");
                }
            } else if (select == 3) {
                int idItem = Integer.valueOf(input.askStr("Enter id:"));
                boolean res = tracker.delete(idItem);
                if (res) {
                    System.out.println("Item was deleted successfully");
                } else {
                    System.out.println("Something went wrong");
                }
            } else if (select == 4) {
                int idItem = Integer.valueOf(input.askStr("Enter id:"));
                Item foundItem = tracker.findById(idItem);
                if (foundItem != null) {
                    System.out.println(foundItem);
                }
            } else if (select == 5) {
                String nameItem = input.askStr("Enter name item:");
                Item [] items  = tracker.findByName(nameItem);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Заявки с таким именем не найдены");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select:");
    }

    public static void main(String[] args) {
        Input consoleInput = new ConsoleInput();
        Tracker tracker = new Tracker();
        tracker.add(new Item(1, "Alex"));
        tracker.add(new Item(2, "Bill"));
        tracker.add(new Item(3, "Jon"));
        new StartUI().init(consoleInput, tracker);
    }
}
