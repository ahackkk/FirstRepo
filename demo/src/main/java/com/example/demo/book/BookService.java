package com.example.demo.book;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookService {

    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> bookList() {
        return bookRepository.findAll();
    }
}