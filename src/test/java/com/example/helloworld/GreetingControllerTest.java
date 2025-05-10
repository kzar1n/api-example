package com.example.helloworld;

import com.example.helloworld.adapters.controllers.GreetingController;
import com.example.helloworld.application.GreetingRepository;
import com.example.helloworld.application.GreetingService;
import com.example.helloworld.domain.Greeting;
import com.example.helloworld.domain.GreetingEntity;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingControllerTest {

    @Test
    public void testGetGreeting() {
        // Arrange
        UUID testUuid = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
        GreetingEntity mockEntity = new GreetingEntity();
        mockEntity.setId(testUuid);
        mockEntity.setMessage("Hello, World!");

        // Mock do repositório
        GreetingRepository mockRepository = Mockito.mock(GreetingRepository.class);
        Mockito.when(mockRepository.findById(testUuid)).thenReturn(Optional.of(mockEntity));

        // Serviço e controlador
        GreetingService service = new GreetingService(mockRepository);
        GreetingController controller = new GreetingController(service);

        // Act
        Greeting greeting = controller.getGreeting(testUuid);

        // Assert
        assertEquals("Hello, World!", greeting.getMessage());
    }
}