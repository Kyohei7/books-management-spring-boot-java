package com.books.management.booksmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.management.booksmanagement.model.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
