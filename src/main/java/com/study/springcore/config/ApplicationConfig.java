package com.study.springcore.config;

import com.study.springcore.SpringCoreApplication;
import com.study.springcore.book.BookRepository;
import com.study.springcore.book.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackageClasses = SpringCoreApplication.class)
public class ApplicationConfig {

    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean
    public BookService bookService() {
        BookService bookService = new BookService();
        bookService.setBookRepository(bookRepository());
        return bookService;
    }
}