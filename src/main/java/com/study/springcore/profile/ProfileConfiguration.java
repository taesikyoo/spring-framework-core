package com.study.springcore.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class ProfileConfiguration {

    @Bean
    public TestRepository testRepository() {
        return new TestRepository();
    }
}
