package com.study.springcore.nullsafety;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class NullService {

    @NonNull
    public String createEvent(@NonNull String name) {
        return "hello" + name;
    }
}
