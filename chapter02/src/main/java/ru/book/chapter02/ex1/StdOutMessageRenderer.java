package ru.book.chapter02.ex1;

/**
 * Created by Alexey on 21.09.2017.
 */
public class StdOutMessageRenderer implements MessageRenderer {

    private MessageProvider provider;

    public void render() {
        if (provider == null) {
            throw new RuntimeException("Не установлено свойство messageProvider класса");
        }
        System.out.println(getMessageProvider().getMessage());
    }

    public void setMessageProvider(MessageProvider provider) {
        this.provider = provider;
    }

    public MessageProvider getMessageProvider() {
        return this.provider;
    }
}
