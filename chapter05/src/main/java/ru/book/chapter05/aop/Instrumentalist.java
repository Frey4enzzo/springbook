package ru.book.chapter05.aop;


public class Instrumentalist implements Performer{

    private Instrument instrument;

    @Override
    public void perform() throws PerfomanceException {
        System.out.println("На сцене новый исполнитель!");
        instrument.play();
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
