package ru.book.chapter05.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Внедрение с помощью аннотаций.
 * Внедряет интерфейс Contestant в компоненты Performer
 */

@Aspect
public class ContestantIntroducer{

    @DeclareParents(
            value = "ru.book.chapter05.aspectj.Performer+",
            defaultImpl = GraciousContestant.class)
    public static Contestant contestant;

}
