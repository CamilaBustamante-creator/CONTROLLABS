package com.sena.controllabs.dto;

import java.time.LocalDateTime;

public record UserResponse(
    Long id,
    String email,
    String nombre,
    String rol,
    boolean activo,
    LocalDateTime created_at) {

}
