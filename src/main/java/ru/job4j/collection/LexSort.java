package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int result = 0;
        String[] leftArrSymbol = left.split("\\.");
        String[] rightArrSymbol = right.split("\\.");

        int intLeftStringSymbol = Integer.parseInt(leftArrSymbol[0]);
        int intRightStringSymbol = Integer.parseInt(rightArrSymbol[0]);
        result = Integer.compare(intLeftStringSymbol, intRightStringSymbol);

        return result;
    }
}