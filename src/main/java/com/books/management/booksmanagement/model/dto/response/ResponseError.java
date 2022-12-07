package com.books.management.booksmanagement.model.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseError {

    private Integer statusCode;
    private LocalDateTime timestamp;
    private String statusMessage;
    private Object error;

}
