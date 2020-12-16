package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = -1;
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            char leftSymbol =  left.charAt(i);
            char rightSymbol =  right.charAt(i);
            result = Character.compare(leftSymbol, rightSymbol);
            if (result != 0) {
                return result;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}