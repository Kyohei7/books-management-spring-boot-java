package com.books.management.booksmanagement.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData {
    private Integer statusCode;
    private String statusMessage;
    private Object data;
}
