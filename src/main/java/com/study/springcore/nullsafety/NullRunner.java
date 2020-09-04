package com.study.springcore.nullsafety;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class NullRunner implements ApplicationRunner {

    @Autowired
    NullService nullService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
       nullService.createEvent(null);
    }
}
