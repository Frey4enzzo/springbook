package ru.book.chapter02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.book.chapter02.ex1.MessageRenderer;
import ru.book.chapter02.ex2.Knight;


public class Main {
    public static void main(String[] args) {

        // ctx - контекст приложения
        ApplicationContext ctx = new ClassPathXmlApplicationContext
                ("META-INF/spring/app-context.xml");

        // используем контекст как фабрику для получения объекта
        MessageRenderer renderer = ctx.getBean("renderer", MessageRenderer.class);
        renderer.render();
        System.out.println("-------------------");

        ApplicationContext ctx1 = new ClassPathXmlApplicationContext
                ("META-INF/spring/knight.xml");

        Knight knight = ctx1.getBean("knight", Knight.class);
        knight.embarkQuest();

    }
}
