package com.sena.controllabs.dto;

import java.time.LocalDateTime;

import jakarta.websocket.Decoder.Text;

public record IncidentResponse(
    Long id,
    Integer equipment_id,
    Integer reported_by,
    Text<?> descripcion,
    String prioridad,
    String estado,
    LocalDateTime createdAt
) {}
