package com.example.helloworld.application;

import com.example.helloworld.domain.Greeting;
import com.example.helloworld.domain.GreetingEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GreetingService {
    private static final Logger logger = LoggerFactory.getLogger(GreetingService.class);
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public Greeting getGreeting(UUID uuid) {
        logger.info("Fetching greeting for UUID: {}", uuid);

        GreetingEntity entity = greetingRepository.findById(uuid)
                .orElseThrow(() -> {
                    logger.error("Greeting not found for UUID: {}", uuid);
                    return new RuntimeException("Greeting not found for UUID: " + uuid);
                });

        logger.info("Found greeting: {}", entity.getMessage());
        return new Greeting(entity.getMessage());
    }
}