package com.study.springcore;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class SpringCoreApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(SpringCoreApplication.class, args);
//    }

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(SpringCoreApplication.class)
                .initializers((ApplicationContextInitializer<GenericApplicationContext>) ctx ->
                        ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Functional Bean Definition")))
                .run(args);
    }
}
