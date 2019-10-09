package com.boot.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.boot.consumer.service.RPCSayHelloService;
import com.boot.provider.service.SayHelloService;
import org.springframework.stereotype.Service;

@Service
public class RPCSayHelloServiceImpl implements RPCSayHelloService {

    @Reference
    private SayHelloService sayHelloService;

    @Override
    public String sayHello() {
        return sayHelloService.sayHello();
    }
}
