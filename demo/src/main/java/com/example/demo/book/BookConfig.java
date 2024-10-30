package com.example.demo.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            BookRepository repository){
        return args -> {
            Book picture = new Book(
                    "Картина Дориана Грэя",
                    198,
                    1400,
                    "Оскар Уайльд"
            );

            Book reachest = new Book(
                    "Самый богатый человек в Вавилоне",
                    242,
                    1200,
                    "Джордж Самюэль Клейсон"
            );

            Book magic = new Book(
                    "Магия утра",
                    340,
                    2000,
                    "Хэл Элрод"
            );
            Book harry = new Book(
                    "Гарри Поттер",
                    310,
                    2200,
                    "Джоан Роулинг"
            );

            Book SAT = new Book(
                    "SAT in 2 months",
                    400,
                    4200,
                    "Erica Meltzer"
            );

            repository.saveAll(
                    List.of(picture, reachest, magic, harry, SAT)
            );
        };
    }
}