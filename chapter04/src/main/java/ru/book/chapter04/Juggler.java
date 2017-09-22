package ru.book.chapter04;

/**
 * Класс жонглер, через конструктор можно передать количество мячей
 */
public class Juggler implements Performer{

    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() throws PerfomanceException {
        System.out.println("Жонглер крутит " + beanBags + " мячика ...");
    }
}
