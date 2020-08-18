package com.study.springcore.book;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@NoArgsConstructor
@Service
public class BookService {

    public BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book save(Book book) {
        book.setCreated(new Date());
        book.setBookStatus(BookStatus.DRAFT);
        return bookRepository.save(book);
    }

    // 라이프사이클 인터페이스
    @PostConstruct
    public void postConstruct() {
        System.out.println("==================================");
        System.out.println("나는 BookService야!ㅎㅎ");
        System.out.println("==================================");
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
