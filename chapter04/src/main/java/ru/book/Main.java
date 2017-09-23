package ru.book;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.book.chapter04.PerfomanceException;
import ru.book.chapter04.Performer;

public class Main {
    public static void main(String[] args) throws PerfomanceException, ru.book.javaconfig.PerfomanceException {

        ApplicationContext ctx = new ClassPathXmlApplicationContext
                ("META-INF/spring/spring-idol.xml");

//        Performer kenny = (Performer) ctx.getBean("kenny");
//        kenny.perform();
//        System.out.println("---------------------");


        ru.book.javaconfig.Performer alex = (ru.book.javaconfig.Performer) ctx.getBean("duke15");
        alex.perform();
    }
}
