package com.sena.controllabs.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sena.controllabs.dto.LoanCreateRequest;
import com.sena.controllabs.dto.LoanResponse;

import jakarta.validation.Valid;

@RequestMapping("/loans")
public interface LoanControllerApi {

    @GetMapping
    ResponseEntity<List<LoanResponse>> getAllLoans(
            @RequestParam(required = false) String room_id, LocalDateTime createdAt
    );

    @GetMapping("/{id}")
    ResponseEntity< LoanResponse> getLoanById(@PathVariable Long id);

    @PostMapping
    ResponseEntity<LoanResponse> createLoan(
            @Valid @RequestBody LoanCreateRequest request
    );

    @PutMapping("/{id}/accept")
    ResponseEntity<LoanResponse> updateLoan(@RequestBody @PathVariable Long id );
}
