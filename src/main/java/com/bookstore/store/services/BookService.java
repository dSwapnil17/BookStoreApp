package com.bookstore.store.services;

import java.util.List;
import java.util.Optional;

import com.bookstore.store.entities.Book;

public interface BookService {

    public Book addBook(Book book);
    public List<Book> getAllBooks();
    public Optional<Book> getBookById(long Id); 
}
