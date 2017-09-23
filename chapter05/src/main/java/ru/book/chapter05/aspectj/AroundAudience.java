package ru.book.chapter05.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Создание советов, выполняемых и до, и после
 */

@Aspect
public class AroundAudience {

    // определяем точку среза
    @Pointcut("execution(* ru.book.chapter05.aspectj.Performer.perform(..))")
    public void perfomance(){}

    @Around("perfomance()")
    public void watchPerfomance(ProceedingJoinPoint joinPoint) {


        try {
            System.out.println("Все заняли свои места");
            System.out.println("Все выключают телефоны");

            long start = System.currentTimeMillis();
            joinPoint.proceed();
            long end = System.currentTimeMillis();

            System.out.println("ХЛОП ХЛОП ХЛОП");
            System.out.println("Выступление длилось: " + (end-start) + " мс");
        } catch (Throwable throwable) {
            System.out.println("Шоу говно! верните наши бабки!");
        }
    }
}
