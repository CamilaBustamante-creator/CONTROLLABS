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

import com.sena.controllabs.dto.IncidentCreateRequest;
import com.sena.controllabs.dto.IncidentResponse;

import jakarta.validation.Valid;

@RequestMapping("/incidents")
public interface IncidentControllerApi {

    @GetMapping
    ResponseEntity<List<IncidentResponse>> getAllIncidents(
            @RequestParam(required = false) String estado
    );

    @GetMapping("/{id}")
    ResponseEntity<IncidentResponse> getIncidentById(@PathVariable Long id);

    @PostMapping
    ResponseEntity<IncidentResponse> createIncident(
            @Valid @RequestBody IncidentCreateRequest request
    );

    @PatchMapping("/{id}")
    ResponseEntity<IncidentResponse> updateIncident(@RequestBody @PathVariable Long id );
}
