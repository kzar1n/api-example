package com.example.helloworld.application;

import com.example.helloworld.domain.GreetingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GreetingRepository extends JpaRepository<GreetingEntity, UUID> {
}
