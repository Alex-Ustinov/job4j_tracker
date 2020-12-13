package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = -1;
        for(int i = 0; i < left.length(); i ++) {
            char leftSymbol =  left.charAt(i);
            char rightSymbol =  right.charAt(i);
            int leftCodeSymbol = (int) leftSymbol;
            int rightCodeSymbol = (int) rightSymbol;
            if (leftCodeSymbol != rightCodeSymbol) {
                result = Integer.compare(leftCodeSymbol, rightCodeSymbol);
                break;
            } else if (leftCodeSymbol == rightCodeSymbol && left.length() == right.length()) {
                result = 0;
            }
        }
        return result;
    }
}