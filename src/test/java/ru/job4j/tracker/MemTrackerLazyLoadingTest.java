package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.*;

public class MemTrackerLazyLoadingTest {
    @Test
    public void whenLinkInSingletonTheSame() {
        MemTracker trackerLazyLoading = TrackerLazyLoading.getInstance();
        MemTracker trackerLazyLoadingTheSame = TrackerLazyLoading.getInstance();
        assertSame(trackerLazyLoading, trackerLazyLoadingTheSame);
    }
}