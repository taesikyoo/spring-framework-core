package com.study.springcore.book;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class BookService {

    @Autowired
    public BookRepository bookRepository;

    public Book save(Book book) {
        book.setCreated(new Date());
        book.setBookStatus(BookStatus.DRAFT);
        return bookRepository.save(book);
    }

    // 라이프사이클 인터페이스
    @PostConstruct
    public void postConstruct() {
        System.out.println("나는 BookService야!ㅎㅎ");
        System.out.println(bookRepository.getClass());
    }

    public void printBookRepository() {
        System.out.println(bookRepository.getClass());
    }
}
