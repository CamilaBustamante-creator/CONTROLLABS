package com.sena.controllabs.controller;

import com.sena.controllabs.dto.RoomCreateRequest;
import com.sena.controllabs.dto.RoomResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

// El prefijo /api/v1 se configura globalmente en application.properties (spring.mvc.servlet.path=/api/v1)
@RequestMapping("/rooms")
public interface RoomControllerApi {

    // 1. GET Listar Aulas con Query Param opcional (?block=A) -> URL Final: /api/v1/rooms?block=A
    //http://localhost:8080/api/v1/rooms
    //http://localhost:8080/api/v1/rooms/?block=FONTIBON
    @GetMapping
    ResponseEntity<List<RoomResponse>> getAllRooms(
            @RequestParam(required = false) String block
    );

    // 2. GET Obtener Aula por ID de Path Variable -> URL Final: /api/v1/rooms/{id}
    //http://localhost:8080/api/v1/rooms/1
    @GetMapping("/{id}")
    ResponseEntity<RoomResponse> getRoomById(@PathVariable Long id);

    // 3. POST Crear Aula recibiendo DTO en Request Body -> URL Final: /api/v1/rooms
    //http://localhost:8080/api/v1/rooms
    @PostMapping
    ResponseEntity<RoomResponse> createRoom(
            @Valid @RequestBody RoomCreateRequest request
    );

    // 4. DELETE Eliminar Aula por ID -> URL Final: /api/v1/rooms/{id}
    //http://localhost:8080/api/v1/rooms/3
    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteRoom(@PathVariable Long id);
}
