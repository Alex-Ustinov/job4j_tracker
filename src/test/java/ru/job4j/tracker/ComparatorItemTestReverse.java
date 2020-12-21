package ru.job4j.tracker;

import java.util.ArrayList;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ComparatorItemTestReverse {
    @Test
    public void compareItem() {
        ComparatorItemReverse comparatorItemReverse = new ComparatorItemReverse();
        Item item2 = new Item("Sam");
        Item item1 = new Item("Alex");
        ArrayList<Item> arrayList = new ArrayList<>();
        arrayList.add(item2);
        arrayList.add(item1);
        arrayList.sort(comparatorItemReverse);
        assertThat(arrayList.get(0).getName(), is(item2.getName()));
    }
}