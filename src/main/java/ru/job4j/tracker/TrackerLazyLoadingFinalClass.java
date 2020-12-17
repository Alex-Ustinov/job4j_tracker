package ru.job4j.tracker;

public class TrackerLazyLoadingFinalClass {

    private static final class Holder {
        private static final Tracker TRACKER_HOLDER = new Tracker();
    }

    private TrackerLazyLoadingFinalClass() {

    }

    public static Tracker getInstance() {
        return Holder.TRACKER_HOLDER;
    }

}
