package ru.book.inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component("eddie")
public class Instrumentalist implements Performer {

    public void perform() throws PerformanceException {
      instrument.play();
    }

    @Inject
    private Instrument instrument;

    @Value("#{systemProperties.mySong}")
    private String song;

    public Instrument getInstrument() {
      return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}

