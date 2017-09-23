package ru.book.javaconfig;

/**
 * Created by Alexey on 22.09.2017.
 */
public class Guitar implements Instrument {

    @Override
    public void play() {
        System.out.println("Гитара бренькает ...");
    }
}
