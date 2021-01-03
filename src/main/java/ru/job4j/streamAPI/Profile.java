package ru.job4j.streamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    Profile(Address address) {
        this.address = address;
    }
}
