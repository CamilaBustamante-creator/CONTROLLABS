package com.sena.controllabs.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.sena.controllabs.dto.EquipmentCreateRequest;
import com.sena.controllabs.dto.EquipmentResponse;

import jakarta.validation.Valid;


@RestController
public class EquipmentController implements EquipmentControllerApi {

    @Override
    public ResponseEntity<List<EquipmentResponse>> getAllEquipments(String room_id) {
        EquipmentResponse equipment = new EquipmentResponse(
                1L,
                "F3410706",
                "123456",
                "COMPUTADOR",
                2,
                "OPERATIVO"
        );
        return ResponseEntity.ok(List.of(equipment));
    }

    @Override
    public ResponseEntity<EquipmentResponse> createEquipment(@Valid EquipmentCreateRequest request) {
        EquipmentResponse createdEquipment = new EquipmentResponse(
                2L, request.placa_sena(), request.codigo_activo(), request.tipo(),
                1, "OPERATIVO"
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEquipment);
    }

    @Override
    public ResponseEntity<EquipmentResponse> updateEquipment(Long id) {
        EquipmentResponse updatedEquipment = new EquipmentResponse(
                1L,
                "F3410706",
                "123456",
                "COMPUTADOR",
                2,
                "OPERATIVO"
        );
        return ResponseEntity.ok(updatedEquipment);
    }

}
