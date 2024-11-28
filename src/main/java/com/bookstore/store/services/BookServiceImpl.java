package com.bookstore.store.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bookstore.store.entities.Book;
import com.bookstore.store.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(long Id) {
        return bookRepository.findById(Id);
    }


}
