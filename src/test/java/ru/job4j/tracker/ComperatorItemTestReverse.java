package ru.job4j.tracker;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ComperatorItemTestReverse extends TestCase {
    public void compareItem() {
        ComperatorItemReverse comperatorItemReverse = new ComperatorItemReverse();
        Item item2 = new Item("Sam");
        Item item1 = new Item("Alex");
        ArrayList arrayList = new ArrayList<Item>();
        arrayList.add(item2);
        arrayList.add(item1);
        Collections.sort(arrayList, comperatorItemReverse);
        assertThat(arrayList.get(1), is(item2.getName()));
    }
}