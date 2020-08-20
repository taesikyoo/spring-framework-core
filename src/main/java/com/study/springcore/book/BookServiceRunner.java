package com.study.springcore.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BookServiceRunner implements ApplicationRunner {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private BookService bookService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(applicationContext.getBean(AutowiredAnnotationBeanPostProcessor.class));
        bookService.printBookRepository();
    }
}
