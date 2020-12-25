package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        String[] arrLettersLeft = left.split("");
        String[] arrLettersRight = right.split("");
        HashSet<String> hashSetLeft = new HashSet<>(Arrays.asList(arrLettersLeft));
        for (String letter : arrLettersRight) {
            if (!hashSetLeft.contains(letter)) {
                return false;
            }
        }
        return true;
    }
}