package com.study.springcore.book;

import org.springframework.stereotype.Repository;

@Repository
public class NewBookRepository implements BookRepository{

    public Book save(Book book) {
        return null;
    }
}
