package com.sena.controllabs.dto;

import java.time.LocalDateTime;

public record RoomResponse(
    Long id,
    String code,
    String name,
    Integer totalPcs,
    String locationBlock,
    String status,
    LocalDateTime createdAt
) {

}
