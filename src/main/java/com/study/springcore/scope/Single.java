package com.study.springcore.scope;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Single {

    @Autowired
    private Proto proto;
    //private ObjectProvider<Proto> protos;

    public Proto getProto() {
        return proto;
    }
}
