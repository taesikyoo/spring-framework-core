package com.study.springcore.property;

import com.study.springcore.profile.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class PropertyRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext ctx;

    @Autowired
    TestRepository testRepository;

    @Value("${app.about}")
    String appAbout;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment environment = ctx.getEnvironment();
        System.out.println(environment.getProperty("app.about"));
        System.out.println(appAbout);
    }
}
