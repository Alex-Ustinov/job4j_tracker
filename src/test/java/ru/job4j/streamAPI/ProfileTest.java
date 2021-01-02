package ru.job4j.streamAPI;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfileTest {

    @Test
    public void testCollectAddress () {
        List<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile(new Address("New York", "Madison square garden", 1, 1)));
        profiles.add(new Profile(new Address("Manchester", "Old Trafford", 1, 1)));
        profiles.add(new Profile(new Address("Madrid", "Santiago Bernabeu", 1, 1)));
        profiles.add(new Profile(new Address("Liverpool", "Anfield", 1, 1)));
        assertThat(profiles, is(profiles));
    }

}