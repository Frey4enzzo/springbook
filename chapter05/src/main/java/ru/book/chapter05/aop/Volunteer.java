package ru.book.chapter05.aop;

/**
 * Created by Alexey on 22.09.2017.
 */

public class Volunteer implements Thinker {

    private String thoughts;

    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
