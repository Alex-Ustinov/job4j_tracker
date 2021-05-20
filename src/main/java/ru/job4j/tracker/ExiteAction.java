package ru.job4j.tracker;

public class ExiteAction implements UserAction {
    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(Input input, MemTracker tracker) {
        return false;
    }
}
