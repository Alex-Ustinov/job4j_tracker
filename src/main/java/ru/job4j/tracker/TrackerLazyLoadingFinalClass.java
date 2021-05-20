package ru.job4j.tracker;

public class TrackerLazyLoadingFinalClass {

    private static final class Holder {
        private static final MemTracker TRACKER_HOLDER = new MemTracker();
    }

    private TrackerLazyLoadingFinalClass() {

    }

    public static MemTracker getInstance() {
        return Holder.TRACKER_HOLDER;
    }

}
