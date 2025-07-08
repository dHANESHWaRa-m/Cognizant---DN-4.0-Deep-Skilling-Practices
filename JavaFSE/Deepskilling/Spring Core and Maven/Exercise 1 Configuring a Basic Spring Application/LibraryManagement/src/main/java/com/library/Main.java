package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class Main {
    public static void main(String[] args) {

        System.out.println("Loading Spring Application Context...");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Spring Application Context loaded successfully.");

        BookService bookService = context.getBean("bookService", BookService.class);


        bookService.addBook("The Great Gatsby");
        bookService.addBook("1984");


        ((ClassPathXmlApplicationContext) context).close();
    }
}