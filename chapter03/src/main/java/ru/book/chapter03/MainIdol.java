package ru.book.chapter03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.book.chapter03.springidol.PerfomanceException;
import ru.book.chapter03.springidol.Performer;

/**
 * Имитируем здесь нашу сцену с представлением
 */

public class MainIdol {

    public static void main(String[] args) throws PerfomanceException {

        ApplicationContext ctx = new ClassPathXmlApplicationContext
                ("/META-INF/spring/spring-idol.xml");

        // реализация жонглера через бин (обычный жонглер)
        Performer duke = (Performer) ctx.getBean("duke");
        duke.perform();
        System.out.println("---------------------");

        // реализация жонглера с переданными в конструктор параметрами
        // (продвинутый жонглер)
        Performer frey = ctx.getBean("frey", Performer.class);
        frey.perform();
        System.out.println("---------------------");

        // тритий жонглер еще и поет
        Performer juggler3 = (Performer) ctx.getBean("taras");
        juggler3.perform();
        System.out.println("---------------------");

        // выступление исполнителя igor на пианино
        Performer igor = ctx.getBean("igor", Performer.class);
        igor.perform();
        System.out.println("---------------------");

        // выступление человека оркестра
        Performer alesha = (Performer) ctx.getBean("alesha");
        alesha.perform();
        System.out.println("---------------------");

        // выступления обекта OneManMap
        Performer shum = ctx.getBean("shum", Performer.class);
        shum.perform();
        System.out.println("--------- SPEL ------------");


        Performer carlSpel = (Performer) ctx.getBean("carl");
        carlSpel.perform();
        System.out.println("---------------------");
    }
}
