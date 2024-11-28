package com.bookstore.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.store.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
