package ru.job4j.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-5);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(15);
        arrayList.add(-1);
        List positiveNumber = arrayList
                .stream()
                .filter(num -> num >= 0)
                .collect(Collectors.toList());
        positiveNumber.forEach(System.out::println);
    }

}
