package ru.book.chapter05.aop;

/**
 * Created by Alexey on 22.09.2017.
 */

public interface MindReader {

    void interceptThoughts(String thoughts);

    String getThoughts();
}
