package com.example.springbootapp.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException() {
        super("Book not found");
    }

    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

