package com.books.management.booksmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.books.management.booksmanagement.model.dto.request.BookManagementRequest;
import com.books.management.booksmanagement.model.dto.response.ResponseData;
import com.books.management.booksmanagement.service.BookManagementService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/book/borrow")
public class BookManagementController {

    @Autowired
    private BookManagementService bookManagementService;

    private ResponseData responseData;

    @PostMapping
    public ResponseEntity<ResponseData> createBookBorrow(@RequestBody @Valid BookManagementRequest request)
            throws Exception {
        responseData = bookManagementService.borrowBookService(request);
        return ResponseEntity.status(responseData.getStatusCode()).body(responseData);
    }

}
