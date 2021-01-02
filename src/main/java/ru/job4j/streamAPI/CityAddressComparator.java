package ru.job4j.streamAPI;

import java.util.Comparator;

public class CityAddressComparator implements Comparator<Address> {
    @Override
    public int compare(Address a1, Address a2) {
        return a1.getCity().compareTo(a2.getCity());
    }
}
