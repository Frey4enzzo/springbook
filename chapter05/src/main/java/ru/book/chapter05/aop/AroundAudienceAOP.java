package ru.book.chapter05.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Метод watchPerfomance() реализует совет АОР, выполняемый и до,
 * и после вызова целевого метода proceed()
 */

public class AroundAudienceAOP {

    public void watchPerfomance(ProceedingJoinPoint joinPoint) {

        try {
            System.out.println("Зрители занимают места в зале");
            System.out.println("Зрители выключают свои телефоны");
            long start = System.currentTimeMillis();

            joinPoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("Зрители апплодируют: ХЛОП ХЛОП ХЛОП");
            System.out.println("Время выступления: " + (end-start) + " мс");

        } catch (Throwable throwable) {
            System.out.println("Выступление отстой, верните наши бабки!");;
        }
    }
}
