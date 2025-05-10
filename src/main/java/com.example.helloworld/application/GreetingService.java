package com.example.helloworld.application;

import com.example.helloworld.domain.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private static final Logger logger = LoggerFactory.getLogger(GreetingService.class);

    public Greeting getGreeting() {
        logger.info("{{\"timestamp\":\"{}\",\"level\":\"INFO\",\"message\":\"Generating greeting message\"}}", System.currentTimeMillis());
        return new Greeting("Hello, World!");
    }
}