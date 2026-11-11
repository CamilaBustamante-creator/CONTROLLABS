package com.sena.controllabs.dto;

import java.time.LocalDateTime;


public record IncidentResponse(
    Long id,
    Integer equipment_id,
    Integer reported_by,
    String descripcion,
    String prioridad,
    String estado,
    LocalDateTime createdAt
) {}
