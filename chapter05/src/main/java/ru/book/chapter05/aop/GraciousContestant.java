package ru.book.chapter05.aop;

/**
 * Created by Alexey on 22.09.2017.
 */
public class GraciousContestant implements Contestant {

    @Override
    public void receiveAward() {
        System.out.println("Спасибо моим родителям за эту награду");
    }
}
