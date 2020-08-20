package com.study.springcore.book;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository @Primary
public class MyBookRepository implements BookRepository {

    public Book save(Book book) {
        return null;
    }
}
