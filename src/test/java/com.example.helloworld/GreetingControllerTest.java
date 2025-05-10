package com.example.helloworld;

import com.example.helloworld.adapters.controllers.GreetingController;
import com.example.helloworld.application.GreetingService;
import com.example.helloworld.domain.Greeting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingControllerTest {

    @Test
    public void testGetGreeting() {
        GreetingService service = new GreetingService();
        GreetingController controller = new GreetingController(service);

        Greeting greeting = controller.getGreeting();
        assertEquals("Hello, World!", greeting.getMessage());
    }
}