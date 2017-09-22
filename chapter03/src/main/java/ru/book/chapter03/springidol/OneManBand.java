package ru.book.chapter03.springidol;

import java.util.Collection;

/**
 * Человек-оркестр (объект этого класса способен играть на нескольких
 * инструментах одновременнно)
 */
public class OneManBand implements Performer{

    private Collection<Instrument> instruments;

    public OneManBand() {
    }

    public void perform() throws PerfomanceException {
        System.out.println("На сцене человек-оркестр!");
        instruments.forEach(instrument -> instrument.play());
    }

    // внедрение коллекции инструментов
    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
