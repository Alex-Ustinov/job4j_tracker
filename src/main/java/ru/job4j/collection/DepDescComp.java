package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        String[] leftArr = left.split("\\\\");
        String[] rightArr = right.split("\\\\");
        for (int i = 0; i < Math.min(leftArr.length, rightArr.length); i++) {
            int intLeftStringSymbol = Integer.parseInt(leftArr[i]);
            int intRightStringSymbol = Integer.parseInt(rightArr[i]);
            result = Integer.compare(intLeftStringSymbol, intRightStringSymbol);
            if (result != 0) {
                return result;
            }
        }
        return result;
    }
}
