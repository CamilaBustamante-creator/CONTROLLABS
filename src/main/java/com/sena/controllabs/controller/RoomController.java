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
        return ResponseEntity.ok(roomService.findAll());
    }

    @Override
    public ResponseEntity<RoomResponse> getRoomById(Long id) {
        return ResponseEntity.ok(roomService.findById(id));
    }

    @Override
    public ResponseEntity<RoomResponse> createRoom(RoomCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(roomService.save(request));
    }

    @Override
    public ResponseEntity<Void> deleteRoom(Long id) {
        // HTTP 204 No Content para borrados exitosos sin cuerpo de respuesta
        roomService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}