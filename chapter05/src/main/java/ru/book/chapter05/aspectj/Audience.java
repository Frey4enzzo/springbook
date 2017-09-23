package ru.book.chapter05.aspectj;

import org.aspectj.lang.annotation.*;

/**
 * Создание советов, выполняемых и до, и после
 */

@Aspect
public class Audience {

    // определяем точку среза
    @Pointcut("execution(* ru.book.chapter05.aspectj.Performer.perform(..))")
    public void perfomance(){}

    @Before("perfomance()")
    public void takeSeats() {   // перед выступлением
        System.out.println("Зрители занимают места в аудитории");
    }

    @Before("perfomance()")
    public void turnOffCellPhones() {     // перед выступлением
        System.out.println("Все выключают телефоны");
    }

    @AfterReturning("perfomance()")
    public void applaud() {        // после выступления
        System.out.println("ХЛОП ХЛОП ХЛОП");
    }

    @AfterThrowing("perfomance()")
    public void demandRefund() {     // после неудачного выступления
        System.out.println("Это наебалово! Верните деньги!");
    }
}
