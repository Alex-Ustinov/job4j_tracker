package ru.job4j.tracker;

import ru.job4j.ex.ElementNotFoundException;
import ru.job4j.opp.ConsoleInput;

public class StartUI {
    private final Output out;

    StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.length) {
                out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                continue;
            }
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(new ConsoleInput(), output);
        Tracker tracker = new Tracker();
        tracker.add(new Item(1, "Alex"));
        tracker.add(new Item(2, "Bill"));
        tracker.add(new Item(3, "Jon"));
        UserAction[] actions = {
                new ShowAllItemsAction(output),
                new CreateAction(output),
                new DeleteAction(output),
                new ReplaceItemAction(output),
                new FindItemByNameAction(output),
                new ExiteAction()
        };
        new StartUI(output).init(input, tracker, actions);
    }
}
