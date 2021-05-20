package ru.job4j.tracker;

public class TrackerEagerLoading {
    private static MemTracker tracker = new MemTracker();

    private TrackerEagerLoading() {

    }

    public MemTracker getInstance() {
        return this.tracker;
    }
}
