package ru.book.chapter04;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Alexey on 22.09.2017.
 */

@Qualifier("stringed")
public class Guitar implements Instrument {


    public void play() {
        System.out.println("Гитара бренькает ...");
    }
}
