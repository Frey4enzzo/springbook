package ru.book.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Alexey on 22.09.2017.
 */

@Configuration
public class SpringIdolConfig {

    @Bean
    public Performer duke() {  // компонент типа Juggler с id = duke
        return new Juggler();
    }

    @Bean
    public Performer duke15() {
        return new Juggler(15);
    }

    // внедрение через метод записи
    @Bean
    public Performer alex() {
        Instrumentalist alex = new Instrumentalist();
        alex.setSong("Alex Song");
        return alex;
    }

    @Bean
    public Poem sonnet() {
        return new Sonnet();
    }

    @Bean
    public Performer poeticDuke() {
        return new PoeticJuggler(sonnet());
    }
}
