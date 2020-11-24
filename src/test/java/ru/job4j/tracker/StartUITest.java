package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.opp.ConsoleInput;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class StartUITest {

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
}