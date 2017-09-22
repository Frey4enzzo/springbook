package ru.book.chapter03.springidol;

/**
 * Класс сцены для выступлений (сцена только одна - поэтому синглтон)
 */

public class Stage {

    private Stage() {}

    private static class StageSingletonHolder {
        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}
