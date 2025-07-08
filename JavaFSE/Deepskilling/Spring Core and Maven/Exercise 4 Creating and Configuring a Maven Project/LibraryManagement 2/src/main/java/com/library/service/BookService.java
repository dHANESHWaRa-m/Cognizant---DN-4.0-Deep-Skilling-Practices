package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("BookService: Setting BookRepository dependency."); // Added for verification
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        System.out.println("BookService: Adding book - " + title);
        if (bookRepository != null) {
            bookRepository.saveBook(title);
        } else {
            System.err.println("BookService: BookRepository is null! Dependency injection failed.");
        }
    }
}