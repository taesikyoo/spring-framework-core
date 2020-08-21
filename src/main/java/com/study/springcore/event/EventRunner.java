package com.study.springcore.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class EventRunner implements ApplicationRunner {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void run(ApplicationArguments args) throws Exception {
        eventPublisher.publishEvent(new MyEvent(100,this));
    }
}

