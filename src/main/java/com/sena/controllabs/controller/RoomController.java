package com.sena.controllabs.controller;

import com.sena.controllabs.dto.RoomCreateRequest;
import com.sena.controllabs.dto.RoomResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class RoomController implements RoomControllerApi {

    @Override
    public ResponseEntity<List<RoomResponse>> getAllRooms(String block) {
        RoomResponse sampleRoom = new RoomResponse(
                1L, "SENA-301", "AMBIENTE 301", 31,
                "FONTIBÓN", "DISPONIBLE", LocalDateTime.now()
        );
        return ResponseEntity.ok(List.of(sampleRoom));
    }

    @Override
    public ResponseEntity<RoomResponse> getRoomById(Long id) {
        RoomResponse room = new RoomResponse(
                id, "LAB-" + id, "Laboratorio Computación " + id, 25,
                "Bloque B", "DISPONIBLE", LocalDateTime.now()
        );
        return ResponseEntity.ok(room);
    }

    @Override
    public ResponseEntity<RoomResponse> createRoom(RoomCreateRequest request) {
        // En esta etapa el Controller construye el Response DTO con estado 201 CREATED
        RoomResponse createdRoom = new RoomResponse(
                202L, request.code(), request.name(), request.totalPcs(),
                request.locationBlock(), "REGISTRADO", LocalDateTime.now()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRoom);
    }

    @Override
    public ResponseEntity<Void> deleteRoom(Long id) {
        // HTTP 204 No Content para borrados exitosos sin cuerpo de respuesta
        return ResponseEntity.noContent().build();
    }
}
