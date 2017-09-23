package ru.book.chapter05.aop;

/**
 * Created by Alexey on 22.09.2017.
 */

public class Magician implements MindReader{

    private String thoughts;

    public void interceptThoughts(String thoughts) {
        System.out.println("Читаю мысли добровольца");
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
