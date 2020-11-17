package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(item.getCreated().format(dateTimeFormatter));
        Tracker tracker1 = new Tracker();
        tracker1.add(new Item(1,"class"));
        tracker1.add(new Item(2,"lesson"));
        System.out.println(tracker1.findById(1).getName());
    }
}
