package ru.job4j.tracker;

import ru.job4j.tracker.Input;

public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(this.askStr(question));
    }

    @Override
    public String askStr(String question) {
        String test = this.answers[position++];
        return test;
    }
}
