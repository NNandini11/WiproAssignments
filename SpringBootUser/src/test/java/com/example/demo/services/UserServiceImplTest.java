package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userServiceImpl;

    @DisplayName("Testing addUser in service layer")
    @Test
    void addUserTest() {
        // Input user (controller → service)
        User inputUser = new User(null, "nandini", "nandini123@gmail.com");

        // Expected saved user (repo → service)
        User savedUser = new User(72L, "nandini", "nandini123@gmail.com");

        // Mock repo call
        Mockito.when(userRepository.save(inputUser)).thenReturn(savedUser);

        // Call service
        User result = userServiceImpl.addUser(inputUser);

        // Assertions
        assertEquals(72L, result.getId());
        assertEquals("nandini", result.getName());
        assertEquals("nandini123@gmail.com", result.getEmail());
    }
}
