package com.example.demo.book;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> bookList() {
        return bookRepository.findAll();
    }

    public void addNewBook(Book book) {
        Optional<Book> bookByName = bookRepository
                .findBookByName(book.getName());
        if (bookByName.isPresent()) {
            throw new IllegalStateException("Книга с таким названием уже существуется");
        }
        bookRepository.save(book);
    }
}