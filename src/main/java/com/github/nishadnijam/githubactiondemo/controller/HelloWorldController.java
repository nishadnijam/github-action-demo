package com.github.nishadnijam.githubactiondemo.controller;

import com.github.nishadnijam.githubactiondemo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String fetchHelloWorld() {
        return helloWorldService.fetchHelloWorld();
    }
}
