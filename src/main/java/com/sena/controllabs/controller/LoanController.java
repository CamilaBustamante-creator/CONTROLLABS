package com.sena.controllabs.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.sena.controllabs.dto.LoanCreateRequest;
import com.sena.controllabs.dto.LoanResponse;

import jakarta.validation.Valid;


@RestController
public class LoanController implements LoanControllerApi {
    
    @Override
    public ResponseEntity<List<LoanResponse>> getAllLoans(String room_id, LocalDateTime createdAt) {
        LoanResponse loan = new LoanResponse(
                1L,
                1,
                2,
                3,
                24,
                "PENDIENTE_APROBACION",
                LocalDateTime.now(),
                LocalDateTime.now()
        );
        return ResponseEntity.ok(List.of(loan));
    }

    @Override
    public ResponseEntity<LoanResponse> getLoanById(Long id) {
        LoanResponse loan = new LoanResponse(
                1L,
                1,
                2,
                3,
                24,
                "PENDIENTE_APROBACION",
                LocalDateTime.now(),
                LocalDateTime.now()
        );
        return ResponseEntity.ok(loan);
    }
    

    @Override
    public ResponseEntity<LoanResponse> createLoan(@Valid LoanCreateRequest request) {
        LoanResponse createdLoan = new LoanResponse(
                2L, 2, 1, 4, 25, "PENDIENTE_APROBACION", LocalDateTime.now(), LocalDateTime.now()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(createdLoan);
    }

    

    @Override
    public ResponseEntity<LoanResponse> updateLoan(Long id) {
        LoanResponse updatedLoan = new LoanResponse(
                1L,
                1,
                2,
                3,
                24,
                "PENDIENTE_APROBACION",
                LocalDateTime.now(),
                LocalDateTime.now()
        );
        return ResponseEntity.ok(updatedLoan);
    }

    
}
