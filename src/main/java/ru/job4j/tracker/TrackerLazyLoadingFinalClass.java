package ru.job4j.tracker;

public class TrackerLazyLoadingFinalClass {

    private static final class Holder {
        private static final Tracker trackerHolder = new Tracker();
    }

    private TrackerLazyLoadingFinalClass() {

    }

    public static Tracker getInstance() {
        return Holder.trackerHolder;
    }

}
