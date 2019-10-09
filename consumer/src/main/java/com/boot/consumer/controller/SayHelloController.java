package com.boot.consumer.controller;

import com.boot.consumer.service.RPCSayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {
    @Autowired
    private RPCSayHelloService rpcSayHelloService;

    @GetMapping("/sayHello")
    public String sayHello(){
        return rpcSayHelloService.sayHello();
    }


}
