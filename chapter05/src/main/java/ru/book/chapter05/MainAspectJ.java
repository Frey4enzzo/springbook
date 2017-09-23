package ru.book.chapter05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.book.chapter05.aspectj.PerfomanceException;
import ru.book.chapter05.aspectj.Performer;

public class MainAspectJ {
    public static void main(String[] args) throws PerfomanceException {

        System.out.println("Тестирование внедрение точек среза" +
                "с помощью аннотаций");

        ApplicationContext ctx = new ClassPathXmlApplicationContext
                ("/META-INF/spring/spring-aspectj.xml");

        Performer leonid = (Performer) ctx.getBean("leonid");
        leonid.perform();
    }
}
