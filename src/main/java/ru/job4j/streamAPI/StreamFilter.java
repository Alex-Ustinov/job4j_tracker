package ru.job4j.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    ArrayList<Integer> arrayList = new ArrayList<>(1,-3,-5,7,10);
    List positiveNumber = arrayList.stream().filter(num -> num >= 0).collect(Collectors.toList());
}
