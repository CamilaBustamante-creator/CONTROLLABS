package com.sena.controllabs.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.sena.controllabs.dto.IncidentResponse;
import com.sena.controllabs.dto.IncidentCreateRequest;

import jakarta.validation.Valid;

@RestController
public class IncidentController implements IncidentControllerApi {

    @Override
    public ResponseEntity<List<IncidentResponse>> getAllIncidents(String rol) {
        IncidentResponse incident = new IncidentResponse(
            1L,
            1,
            2,
            "Fallas de luz en el laboratorio",
            "ALTA",
            "PENDIENTE",
            LocalDateTime.now()
        );
        return ResponseEntity.ok(List.of(incident));
    }

    @Override
    public ResponseEntity<IncidentResponse> getIncidentById(Long id) {
        IncidentResponse incident = new IncidentResponse(
            1L,
            1,
            2,
            "Fallas de luz en el laboratorio",
            "ALTA",
            "PENDIENTE",
            LocalDateTime.now()
        );
        return ResponseEntity.ok(incident);
    }
    

    @Override
    public ResponseEntity<IncidentResponse> createIncident(@Valid IncidentCreateRequest request) {
        IncidentResponse createdIncident = new IncidentResponse(
                2L, 2, 1, request.descripcion(),
                request.prioridad(), "PENDIENTE", LocalDateTime.now()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(createdIncident);
    }

    @Override
    public ResponseEntity<IncidentResponse> updateIncident(Long id) {
        IncidentResponse updatedIncident = new IncidentResponse(
            1L,
            1,
            2,
            "Fallas de luz en el laboratorio",
            "ALTA",
            "PENDIENTE",
            LocalDateTime.now()
        );
        return ResponseEntity.ok(updatedIncident);
    }

}
