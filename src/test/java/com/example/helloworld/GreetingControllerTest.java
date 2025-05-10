package com.example.helloworld;

import com.example.helloworld.adapters.controllers.GreetingController;
import com.example.helloworld.application.GreetingService;
import com.example.helloworld.domain.Greeting;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingControllerTest {

    @Test
    public void testGetGreeting() {
        // Arrange
        UUID testUuid = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
        GreetingService service = new GreetingService();
        GreetingController controller = new GreetingController(service);

        // Act
        Greeting greeting = controller.getGreeting(testUuid);

        // Assert
        assertEquals("Hello, World! Your UUID is: 123e4567-e89b-12d3-a456-426614174000", greeting.getMessage());
    }
}