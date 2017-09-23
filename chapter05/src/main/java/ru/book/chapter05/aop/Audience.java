package ru.book.chapter05.aop;

public class Audience {

    public void takeSeats() {   // перед выступлением
        System.out.println("Зрители занимают места в аудитории");
    }

    public void turnOffCellPhones() {     // перед выступлением
        System.out.println("Все выключают телефоны");
    }

    public void applaud() {        // после выступления
        System.out.println("ХЛОП ХЛОП ХЛОП");
    }

    public void demandRefund() {     // после неудачного выступления
        System.out.println("Это наебалово! Верните деньги!");
    }
}
