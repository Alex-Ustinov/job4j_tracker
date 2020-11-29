package ru.job4j.tracker;

public class TrackerLazyLoading {
    private static Tracker tracker;

    private TrackerLazyLoading() {}

    public static Tracker getInstance () {
        if(tracker == null) {
            tracker = new Tracker();
        }
        return tracker;
    }
}
