package ru.book.chapter05.aspectj;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Instrumentalist implements Performer{

    private Instrument instrument;

    @Override
    public void perform() throws PerfomanceException {
        instrument.play();
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
