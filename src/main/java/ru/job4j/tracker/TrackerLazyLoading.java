package ru.job4j.tracker;

public class TrackerLazyLoading {
    private static MemTracker tracker;

    private TrackerLazyLoading() {

    }

    public static MemTracker getInstance() {
        if (tracker == null) {
            tracker = new MemTracker();
        }
        return tracker;
    }
}
