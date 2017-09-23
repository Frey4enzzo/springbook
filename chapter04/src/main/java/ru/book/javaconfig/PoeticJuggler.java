package ru.book.javaconfig;

/**
 * Жонглер, который еще и читает стихи
 * Демонстрация внедрения через конструктор
 */

public class PoeticJuggler extends Juggler{

    private Poem poem;

    public PoeticJuggler(Poem poem) {   // внедрение поэмы через конструктор
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {   // внедрение кол-ва мячиков и поэмы через конструктор
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerfomanceException {
        super.perform();
        System.out.println("Во время чтения поэмы ...");
        poem.recite();
    }
}
