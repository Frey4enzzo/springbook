package ru.book.chapter05.aspectj;

public class GraciousContestant implements Contestant {

    @Override
    public void receiveAward() {
        System.out.println("Спасибо моим родителям за эту награду");
    }
}
