package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean result = true;
        String originWithoutPutch =  origin.replaceAll("\\p{P}", "");
        String lineWithoutPutch = line.replaceAll("\\p{P}", "");
        String[] arrOriginWords = originWithoutPutch.split(" ");
        String[] arrCheckWords = lineWithoutPutch.split(" ");
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