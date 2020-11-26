package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.opp.ConsoleInput;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExiteAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }
    @Test
    public void whenFindAllAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(1,"New item"));
        UserAction[] actions = {
                new ShowAllItemsAction(out),
                new ExiteAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Show all items" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "Item {id=1, name='New item'}" + System.lineSeparator() +
                "Menu." + System.lineSeparator() +
                        "0. Show all items" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByNameAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "New item" ,"1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(1,"New item"));
        UserAction[] actions = {
                new FindItemByNameAction(out),
                new ExiteAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find items by name" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "Item {id=1, name='New item'}" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find items by name" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByIdAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1" ,"1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(1,"New item"));
        UserAction[] actions = {
                new FindItemByIdAction(out),
                new ExiteAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find item by Id" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "Item {id=1, name='New item'}" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find item by Id" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }
    
    @Test(expected = ElementMenuNotFoundException.class)
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] { "4" }
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExiteAction()
        };

    }

/*
    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ExiteAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(1,"Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0" , "1", replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceItemAction(),
                new ExiteAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(1,"Delete item"));
        Input in = new StubInput(
                new String[] {"0", "1" ,"1"}
        );
        UserAction[] actions = {
                new DeleteAction(),
                new ExiteAction()
        };
        new StartUI().init(in, tracker, actions);
        assertNull(tracker.findById(1));
    }


*/

}