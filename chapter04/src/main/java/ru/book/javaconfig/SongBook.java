package ru.book.javaconfig;

/**
 * Created by Alexey on 22.09.2017.
 */

public class SongBook {

    private String[] songTitles;

    public SongBook(String[] songTitles) {
        this.songTitles = songTitles;
    }

    public String pickASong() {
        return songTitles[0];
    }
}
