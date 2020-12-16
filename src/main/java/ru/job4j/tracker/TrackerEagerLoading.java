package ru.job4j.tracker;

public class TrackerEagerLoading {
    private static Tracker tracker = new Tracker();

    private TrackerEagerLoading() {

    }

    public Tracker getInstance() {
        return this.tracker;
    }
}
