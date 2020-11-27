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
        do {
            try {
                value = in.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}
