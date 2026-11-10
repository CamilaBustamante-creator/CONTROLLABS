package com.sena.controllabs.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sena.controllabs.dto.IncidentResponse;
import com.sena.controllabs.dto.UserCreateRequest;
import com.sena.controllabs.dto.UserResponse;

import jakarta.validation.Valid;

@RequestMapping("/incidents")
public interface IncidentControllerApi {

    @GetMapping
    ResponseEntity<List<IncidentResponse>> getAllIncidents(
            @RequestParam(required = false) String estado
    );

    @GetMapping("/{id}")
    ResponseEntity<UserResponse> getUserById(@PathVariable Long id);

    @PostMapping
    ResponseEntity<UserResponse> createUser(
            @Valid @RequestBody UserCreateRequest request
    );

    @PatchMapping("/{id}")
    ResponseEntity<UserResponse> updateUser(@RequestBody @PathVariable Long id );

}
