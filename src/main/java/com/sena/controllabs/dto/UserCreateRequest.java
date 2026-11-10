package com.sena.controllabs.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UserCreateRequest(
        @NotBlank(message = "El email es obligatorio")
        String email,

        @NotBlank(message = "El nombre del usuario es obligatorio")
        String nombre,

        @NotBlank(message = "El rol es obligatorio")
        @Pattern(
        regexp = "ADMIN|GUARDA|INSTRUCTOR",
        message = "El rol debe ser ADMIN, GUARDA o INSTRUCTOR"
        )
        String rol
) {}
