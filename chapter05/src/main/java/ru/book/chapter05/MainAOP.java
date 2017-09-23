package ru.book.chapter05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.book.chapter05.aop.*;

public class MainAOP {
    public static void main(String[] args) throws PerfomanceException {

        ApplicationContext ctx = new ClassPathXmlApplicationContext
                ("META-INF/spring/spring-idol.xml");

        Performer alexey = ctx.getBean("alexey", Performer.class);
        alexey.perform();

        System.out.println("-------Next Performer----------");

        new ClassPathXmlApplicationContext
                ("META-INF/spring/spring-aop-intro.xml").getBean
                ("eddie", Performer.class).perform();

        System.out.println("-------Next Performer----------");

        new ClassPathXmlApplicationContext
                ("META-INF/spring/spring-aop-around.xml").getBean
                ("igor", Performer.class).perform();

        System.out.println("-------Next Performer----------");

        // Magician Test
        ApplicationContext ctx1 = new ClassPathXmlApplicationContext
                ("META-INF/spring/spring-magician.xml");

        Thinker thinker = (Thinker) ctx1.getBean("volunteer");
        thinker.thinkOfSomething("Ща бы коньячку накатить");
        MindReader magician = (MindReader) ctx1.getBean("magician");
        magician.getThoughts();

        System.out.println("-------Next Performer----------");

        // тест внедрения дополнительной реализации
        // eddie является и исполнителем и участником выступления
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("META-INF/spring/spring-aop-intro.xml");

        Performer performer = (Performer) context.getBean("eddie");
        performer.perform();
        Contestant performer1 = (Contestant) context.getBean("eddie");
        performer1.receiveAward();

        System.out.println("-------Next Performer----------");
    }
}
