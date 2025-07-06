package com.example.springbootapp.exception;

public class BookIdMismatchException extends RuntimeException {
    public BookIdMismatchException() {
        super("Book ID mismatch");
    }
}

