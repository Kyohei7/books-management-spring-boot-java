package com.books.management.booksmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.management.booksmanagement.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
