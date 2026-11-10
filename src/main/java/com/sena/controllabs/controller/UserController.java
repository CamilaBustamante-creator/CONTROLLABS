package com.sena.controllabs.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.sena.controllabs.dto.UserCreateRequest;
import com.sena.controllabs.dto.UserResponse;

import jakarta.validation.Valid;

@RestController
public class UserController implements UserControllerApi {
    @Override
    public ResponseEntity<List<UserResponse>> getAllUsers(String rol) {
        UserResponse user = new UserResponse(
                1L,
                "example@gmail.com",
                "Jean Carlos Castro",
                "ADMIN",
                true,
                LocalDateTime.now()
        );
        return ResponseEntity.ok(List.of(user));
    }

    @Override
    public ResponseEntity<UserResponse> getUserById(Long id) {
        UserResponse user = new UserResponse(
                1L,
                "example@gmail.com",
                "Jean Carlos Castro",
                "ADMIN",
                true,
                LocalDateTime.now()
        );
        return ResponseEntity.ok(user);
    }
    

    @Override
    public ResponseEntity<UserResponse> createUser(@Valid UserCreateRequest request) {
        UserResponse createdUser = new UserResponse(
                2L, request.email(), request.nombre(), request.rol(),
                true, LocalDateTime.now()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @Override
    public ResponseEntity<UserResponse> updateUser(Long id) {
        UserResponse updatedUser = new UserResponse(
                1L,
                "example@gmail.com",
                "Jean Carlos Castro",
                "INSTRUCTOR",
                true,
                LocalDateTime.now()
        );
        return ResponseEntity.ok(updatedUser);
    }

    @Override
    public ResponseEntity<Void> deleteUser(Long id) {
        return ResponseEntity.noContent().build();
    }
}
