package com.example.helloworld.application;

import com.example.helloworld.domain.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GreetingService {
    private static final Logger logger = LoggerFactory.getLogger(GreetingService.class);

    public Greeting getGreeting(UUID uuid) {
        logger.info("{{\"timestamp\":\"{}\",\"level\":\"INFO\",\"message\":\"Generating greeting message for UUID: {}\"}}", System.currentTimeMillis(), uuid);
        return new Greeting("Hello, World! Your UUID is: " + uuid);
    }
}