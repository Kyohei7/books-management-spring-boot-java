package com.books.management.booksmanagement.validator;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.books.management.booksmanagement.exception.custom.NotProcessException;
import com.books.management.booksmanagement.model.entity.BookManagement;

@Service
public class BookManagementValidator {

    public void validateBookIdAlreadyBorrow(Optional<BookManagement> bookManagementFind) throws Exception {
        if (bookManagementFind.isPresent()) {
            throw new NotProcessException("Book is Already Borrowed");
        }
    }

}
