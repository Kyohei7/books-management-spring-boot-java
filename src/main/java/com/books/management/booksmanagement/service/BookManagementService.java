package com.books.management.booksmanagement.service;

import com.books.management.booksmanagement.model.dto.request.BookManagementRequest;
import com.books.management.booksmanagement.model.dto.response.ResponseData;

public interface BookManagementService {
    ResponseData borrowBookService(BookManagementRequest request) throws Exception;
}
