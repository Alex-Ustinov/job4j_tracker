package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class Article {

    public static String removePunct(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isAlphabetic(c) || Character.isDigit(c) || Character.isSpaceChar(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static boolean generateBy(String origin, String line) {
        boolean result = true;
        String originWithoutPutch =  removePunct(origin);
        String[] arrOriginWords = originWithoutPutch.split(" ");
        String[] arrCheckWords = line.split(" ");
        HashSet<String> setWords = new HashSet<>(Arrays.asList(arrOriginWords));
        for (String word : arrCheckWords) {
            if (!setWords.contains(word)) {
                result = false;
                break;
            }
        }
        return result;
    }
}