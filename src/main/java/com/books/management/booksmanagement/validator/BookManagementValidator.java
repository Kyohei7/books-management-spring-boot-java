package com.books.management.booksmanagement.validator;

import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.books.management.booksmanagement.exception.custom.NotProcessException;
import com.books.management.booksmanagement.model.entity.BookManagement;

@Service
public class BookManagementValidator {

    public void validateBookIdAlreadyBorrow(List<BookManagement> bookManagementFind) throws Exception {
        if (!Objects.nonNull(bookManagementFind)) {
            throw new NotProcessException("Book is Already Borrowed");
        }
    }

}
