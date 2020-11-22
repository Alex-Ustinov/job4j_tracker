package ru.job4j.tracker;

import ru.job4j.opp.ConsoleInput;

public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        for (UserAction action : actions) {
            System.out.println(action.name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        tracker.add(new Item(1, "Alex"));
        tracker.add(new Item(2, "Bill"));
        tracker.add(new Item(3, "Jon"));
        UserAction[] actions = {
                new ShowAllItemsAction(),
                new CreateAction(),
                new DeleteAction(),
                new ReplaceItemAction(),
                new FindItemByNameAction(),
                new ExiteAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}
