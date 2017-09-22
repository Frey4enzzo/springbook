package ru.book.chapter03.springidol;

/**
 * Внедрение в свойства компонентов
 * Демонастрация внедрения через setters getters
 */

public class Instrumentalist implements Performer{

    private String song;
    private int age;
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
