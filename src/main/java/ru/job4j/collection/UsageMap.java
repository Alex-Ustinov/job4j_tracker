package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<String, String>();
        users.put("test@test.ru", "Alex");
        users.put("test@mocktest.ru", "Saha");
        users.put("test@hashtest.ru", "oly");
        for (String email : users.keySet()) {
            System.out.println(email);
        }
    }
}
