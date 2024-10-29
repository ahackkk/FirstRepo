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

            repository.saveAll(
                    List.of(picture, reachest, magic)
            );
        };
    }
}
