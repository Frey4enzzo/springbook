package ru.book.chapter02.ex1;

/**
 * Created by Alexey on 21.09.2017.
 */

public interface MessageRenderer {

    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
