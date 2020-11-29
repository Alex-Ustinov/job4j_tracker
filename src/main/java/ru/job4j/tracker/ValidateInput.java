package ru.job4j.tracker;

import ru.job4j.opp.ConsoleInput;

public class ValidateInput extends ConsoleInput {

    private final Input in;
    private final Output out;

    ValidateInput(Input in, Output out) {
        this.in = in;
        this.out = out;
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        System.out.println("!!!!");
        do {
            try {
                value = in.askInt(question);
                System.out.println(value);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("&&&&&&");
                out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }

}
