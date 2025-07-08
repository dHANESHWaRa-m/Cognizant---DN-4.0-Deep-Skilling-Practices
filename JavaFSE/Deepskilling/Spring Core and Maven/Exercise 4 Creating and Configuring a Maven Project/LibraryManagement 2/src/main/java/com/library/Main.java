package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class Main{
    public static void main(String[] args) {
        System.out.println("Loading Spring Application Context...");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Spring Application Context loaded successfully.");

        BookService bookService = context.getBean("bookService", BookService.class);

        System.out.println("\n--- Performing Book Operations ---");
        bookService.addBook("The Adventures of Sherlock Holmes");
        bookService.addBook("Pride and Prejudice");

        ((ClassPathXmlApplicationContext) context).close();
        System.out.println("\nSpring Application Context closed.");
    }
}