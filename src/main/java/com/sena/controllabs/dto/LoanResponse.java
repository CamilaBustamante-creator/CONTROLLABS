package com.sena.controllabs.dto;

import java.time.LocalDateTime;

public record LoanResponse(
        Long id,
        Integer room_id,
        Integer instructor_id,
        Integer guarda_id,
        Integer numero_pc ,
        String estado,
        LocalDateTime createdAt,
        LocalDateTime acceptedAt
) {}
