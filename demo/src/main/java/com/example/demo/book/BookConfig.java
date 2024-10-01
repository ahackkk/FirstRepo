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
                    1L,
                    "The Picture of Dorian Gray",
                    198,
                    1600,
                    "George Wasilton"
            );
            Book Vavilons_Richest_Men = new Book(
                    2L,
                    "Richest men of Vavilon",
                    172,
                    1200,
                    "One wise man"
            );

            repository.saveAll(
                    List.of(Dorian_Gray, Vavilons_Richest_Men)
            );
        };
    }
}