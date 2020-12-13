package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int result = 0;
        String [] leftArrSymbol = left.split("\\.");
        String [] rightArrSymbol = right.split("\\.");
        for (int i = 0; i < leftArrSymbol.length; i++) {
            int intLeftStringSymbol = Integer.parseInt(leftArrSymbol[i]);
            int intRightStringSymbol = Integer.parseInt(rightArrSymbol[i]);
            result = Integer.compare(intLeftStringSymbol, intRightStringSymbol);
            if (result != 0) break;
        }
        return result;
    }
}