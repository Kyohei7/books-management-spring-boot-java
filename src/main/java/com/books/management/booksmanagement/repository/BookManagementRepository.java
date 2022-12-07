package com.books.management.booksmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.books.management.booksmanagement.model.entity.BookManagement;

public interface BookManagementRepository extends JpaRepository<BookManagement, Long> {

    // @Query("SELECT bm FROM books_management bm WHERE bm.book_id =?1 AND bm.status
    // = true")
    // List<BookManagement> findByBookIdAndStatus(Long bookId);

}
