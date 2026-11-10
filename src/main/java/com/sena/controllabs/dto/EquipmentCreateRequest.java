package com.sena.controllabs.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record EquipmentCreateRequest(
        @NotBlank(message = "La placa es obligatorio")
        String placa_sena,

        @NotBlank(message = "El codigo es obligatorio")
        String codigo_activo,

        @NotBlank(message = "El tipo es obligatorio")
        @Pattern(
        regexp = "COMPUTADOR|MOUSE|TECLADO|CARGADOR|TELEVISOR|CONTROL_TV",
        message = "El tipo debe ser COMPUTADOR, MOUSE, TECLADO, CARGADOR, TELEVISOR, CONTROL_TV"
        )
        String tipo
) {}
