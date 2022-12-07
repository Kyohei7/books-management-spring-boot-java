package com.books.management.booksmanagement.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class BookRequest {

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Description  is required")
    @Size(min = 20, message = "Description must be mininum 20 characters")
    private String description;

    @NotNull(message = "Publisher is required")
    private Integer publisher_id;

}
