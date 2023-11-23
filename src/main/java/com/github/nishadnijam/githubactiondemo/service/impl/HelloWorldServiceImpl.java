package com.github.nishadnijam.githubactiondemo.service.impl;

import com.github.nishadnijam.githubactiondemo.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String fetchHelloWorld() {
        return "Hello from Spring Boot application containerised with Docker and integrated with CI/CD through GitHub Actions.";
    }
}
