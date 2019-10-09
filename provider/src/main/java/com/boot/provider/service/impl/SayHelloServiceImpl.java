package com.boot.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.provider.service.SayHelloService;

@Service
public class SayHelloServiceImpl implements SayHelloService {
    @Override
    public String sayHello() {
        return "hello Dubbo";
    }
}
