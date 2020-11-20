package ru.job4j.opp;

import ru.job4j.tracker.Input;

import java.util.Scanner;

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }

    @Override
    public String askStr(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
}
