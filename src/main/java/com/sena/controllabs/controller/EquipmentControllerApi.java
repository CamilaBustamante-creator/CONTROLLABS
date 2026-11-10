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

import com.sena.controllabs.dto.EquipmentCreateRequest;
import com.sena.controllabs.dto.EquipmentResponse;

import jakarta.validation.Valid;

@RequestMapping("/equipments")
public interface EquipmentControllerApi {

    @GetMapping
    ResponseEntity<List<EquipmentResponse>> getAllEquipments(
            @RequestParam(required = false) String room_id
    );

    @PostMapping
    ResponseEntity<EquipmentResponse> createEquipment(
            @Valid @RequestBody EquipmentCreateRequest request
    );

    @PatchMapping("/{id}")
    ResponseEntity<EquipmentResponse> updateEquipment(@RequestBody @PathVariable Long id );
}
