package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        String[] arrLettersLeft = left.split("");
        String[] arrLettersRight = right.split("");
        Map<String, Integer> hashMapLeft = new HashMap<>();

        for (String letter : arrLettersLeft) {
            if (!hashMapLeft.containsKey(letter)) {
                hashMapLeft.put(letter, 1);
            } else {
                Integer amountRepeat =  hashMapLeft.get(letter) + 1;
                hashMapLeft.put(letter, amountRepeat);
            }
        }

        for (String letter : arrLettersRight) {
            if (!hashMapLeft.containsKey(letter)) {
                return false;
            } else if (hashMapLeft.get(letter) == 1) {
                hashMapLeft.remove(letter);
            } else {
                Integer newAmountRepeat =  hashMapLeft.get(letter) - 1;
                hashMapLeft.put(letter, newAmountRepeat);
            }
        }
        return arrLettersRight.length > 0 ? false : true;
    }
}