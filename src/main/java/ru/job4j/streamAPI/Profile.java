package ru.job4j.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    Profile (Address address) {
        this.address = address;
    }

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(profile -> profile.address).collect(Collectors.toList());
    }
}
