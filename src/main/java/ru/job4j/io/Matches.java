package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        System.out.println("Всего " + matches + " спичек возьмите 1, 2 или 3  спички");
        Scanner input = new Scanner(System.in);
        while (matches > 3) {
            int select = Integer.valueOf(input.nextLine());
            if (select <= 3 && select > 0) {
                matches = matches - select;
                System.out.println("Осталось " + matches + " спичек");
            } else {
                System.out.println("Вы можете взять не больше 3 спичек");
            }
        }
        if (matches <= 3) {
            System.out.println("Вы выйграли!");
        }
    }
}
