package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrackerLazyLoadingTest {
    @Test
    public void whenLinkInSingletonTheSame() {
        Tracker trackerLazyLoading = TrackerLazyLoading.getInstance();
        Tracker trackerLazyLoadingTheSame = TrackerLazyLoading.getInstance();
        assertSame(trackerLazyLoading, trackerLazyLoadingTheSame);
    }
}