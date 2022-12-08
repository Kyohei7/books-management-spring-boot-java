package com.books.management.booksmanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.books.management.booksmanagement.model.entity.BookManagement;

public interface BookManagementRepository extends JpaRepository<BookManagement, Long> {

    @Query(value = "SELECT * FROM books_management WHERE book_id = ?1 AND status = true LIMIT 1", nativeQuery = true)
    Optional<BookManagement> findByBookIdAndStatus(Long bookId);

}
