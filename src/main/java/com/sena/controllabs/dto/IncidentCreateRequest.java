package com.sena.controllabs.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record IncidentCreateRequest(
        @NotBlank(message = "La descripcion es obligatorio")
        String descripcion,

        @NotBlank(message = "La prioridad es obligatoria")
        @Pattern(
        regexp = "BAJA|MEDIA|ALTA",
        message = "La prioridad debe ser BAJA, MEDIA, ALTA"
        )
        String prioridad
) {}
