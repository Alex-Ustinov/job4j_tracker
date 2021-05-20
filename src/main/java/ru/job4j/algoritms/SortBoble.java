package ru.job4j.algoritms;

import java.lang.reflect.Array;

public class SortBoble {
    public static void main(String[] args) {
        int [] newArr = new int[] {11, 3, 54, 16, 99, 5, 8};
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < newArr.length; i++) {
                if (newArr[i - 1] < newArr[i]) {
                    int shift = newArr[i - 1];
                    newArr[i - 1] = newArr[i];
                    newArr[i] = shift;
                    isSorted = false;
                }
            }
        }
    }
}
