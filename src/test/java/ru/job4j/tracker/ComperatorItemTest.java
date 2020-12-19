package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ComperatorItemTest {

    @Test
    public void compareItem() {
        ComperatorItems comperatorItems = new ComperatorItems();
        Item item2 = new Item("Sam");
        Item item1 = new Item("Alex");
        ArrayList<Item> arrayList = new ArrayList<Item>();
        arrayList.add(item2);
        arrayList.add(item1);
        Collections.sort(arrayList, comperatorItems);
        assertThat(arrayList.get(1).getName(), is(item2.getName()));
    }
}
