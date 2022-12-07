package com.books.management.booksmanagement.model.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookManagementRequest {

    @NotNull(message = "UserId is required")
    private Long userId;

    @NotNull(message = "bookId is required")
    private Long bookId;

    @NotNull(message = "type is required")
    private String type;

    @NotNull(message = "status is required")
    private Boolean status;

    @NotNull(message = "type is required")
    private LocalDateTime startDate;

    @NotNull(message = "type is required")
    private LocalDateTime endDate;

}
