package com.example.demo.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class BookConfig {

    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository) {
        return args -> {
            Book Dorian_Gray = new Book(
                    "The Picture of Dorian Gray",
                    198,
                    1600,
                    "George Wasilton"
            );
            Book Vavilons_Richest_Men = new Book(
                    "Richest men of Vavilon",
                    172,
                    1200,
                    "One wise man"
            );
            Book Jeane_Eair = new Book(
                    "Geane_Eair",
                    340,
                    4100,
                    "Nicolas Jackson"
            );
            Book SAT = new Book(
                    "SAT_Reading",
                    240,
                    5700,
                    "Erica Meltzer"
            );

            repository.saveAll(
                    List.of(Dorian_Gray, Vavilons_Richest_Men)
            );
        };
    }
}