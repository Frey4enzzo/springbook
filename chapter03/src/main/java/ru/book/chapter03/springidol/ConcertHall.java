package ru.book.chapter03.springidol;

/**
 * Created by Alexey on 22.09.2017.
 */
public class ConcertHall {

    // метод инициализации для всех компонентов контекста в файле spring-idol.xml
    public void turnOnLights() {
        System.out.println("Включить огни концертного зала");
    }

    // метод уничтожения для всех компонентов контекста в файле spring-idol.xml
    public void turnOffLights() {
        System.out.println("Выключить освещение концертного зала");
    }
}
