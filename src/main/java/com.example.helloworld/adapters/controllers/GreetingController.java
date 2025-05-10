package com.example.helloworld.adapters.controllers;

import com.example.helloworld.application.GreetingService;
import com.example.helloworld.domain.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/greeting")
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/{uuid}")
    public Greeting getGreeting(@PathVariable UUID uuid) {
        return greetingService.getGreeting(uuid);
    }
}