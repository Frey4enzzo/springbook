package ru.book.chapter04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 */

public class Instrumentalist implements Performer{

    private String song;
    private int age;

    @Autowired
    @Qualifier("guitar")    // выбирает используемый бин по ссылке на id бина либо квалификатор класса Guitar stringed
    private Instrument instrument;

    public Instrumentalist() {
    }


    public void perform() throws PerfomanceException {
        System.out.print("Исполнитель играет песню " + song + " : ");
        instrument.play();
    }

    // внедрение мелодии
    public void setSong(String song) {
        this.song = song;
    }

    // геттер необходим, чтобы использовать свойство в SPEL
    public String getSong() {
        return song;
    }

    // внедрение возраста
    public void setAge(int age) {
        this.age = age;
    }

    // внедрение инструмента
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }
}
