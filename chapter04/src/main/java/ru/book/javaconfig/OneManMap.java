package ru.book.javaconfig;

import java.util.Map;

/**
 * Created by Alexey on 22.09.2017.
 */

public class OneManMap implements Performer {

    private Map<String, Instrument> instruments;

    public OneManMap() {
    }

    @Override
    public void perform() throws PerfomanceException {
        System.out.println("На сцене человек оркестр! MAP");
        instruments.forEach((k, v) -> {
            System.out.print(k + " : ");
            Instrument instrument = instruments.get(k);
            instrument.play();
        });
    }

    // внедрение инструментов в виде отображения
    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}
