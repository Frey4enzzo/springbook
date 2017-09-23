package ru.book.chapter05.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Передача аргументов аннотированным советам
 */

@Aspect
public class Magician implements MindReader {

    private String thoughts;

    // объявление параметризованного среза множества точек сопряжения
    @Pointcut("execution(* ru.book.chapter05.aspectj.Thinker.thinkOfSomething())" +
            "&& args(thoughts)")
    public void thinking(String thoughts) {}

    @Before("thinking(thoughts)")          // передача параметра в совет
    public void interceptThoughts(String thoughts) {
        System.out.println("Перехватываю мысли зрителя : " + thoughts);
        this.thoughts = thoughts;
    }


    public String getThoughts() {
        return thoughts;
    }
}
