package com.books.management.booksmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.books.management.booksmanagement.model.dto.request.BookManagementRequest;
import com.books.management.booksmanagement.model.dto.response.ResponseData;
import com.books.management.booksmanagement.model.entity.Book;
import com.books.management.booksmanagement.model.entity.BookManagement;
import com.books.management.booksmanagement.model.entity.User;
import com.books.management.booksmanagement.repository.BookManagementRepository;
import com.books.management.booksmanagement.repository.BookRepository;
import com.books.management.booksmanagement.repository.UserRepository;
import com.books.management.booksmanagement.validator.BookManagementValidator;

@Service
@Transactional
public class BookManagementServiceImpl implements BookManagementService {

    @Autowired
    private BookManagementRepository bookManagementRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookManagementValidator bookManagementValidator;

    private ResponseData responseData;

    @Override
    public ResponseData borrowBookService(BookManagementRequest request) throws Exception {

        // Cek Data Buku dipinjam atau sudah selesai where book_id and status
        Optional<BookManagement> bookManagementFind = bookManagementRepository
                .findByBookIdAndStatus(request.getBookId());
        bookManagementValidator.validateBookIdAlreadyBorrow(bookManagementFind);

        Optional<Book> bookFind = bookRepository.findById(request.getBookId());
        Optional<User> userFind = userRepository.findById(request.getUserId());

        Book book = bookFind.get();
        User user = userFind.get();

        BookManagement bookManagement = new BookManagement(
                request.getType(),
                request.getStatus(),
                request.getStartDate(),
                request.getEndDate());

        bookManagement.setBook(book);
        bookManagement.setUser(user);

        bookManagementRepository.save(bookManagement);

        responseData = new ResponseData(
                201,
                "Success Borrow Book",
                bookManagement);

        return responseData;
    }

}
