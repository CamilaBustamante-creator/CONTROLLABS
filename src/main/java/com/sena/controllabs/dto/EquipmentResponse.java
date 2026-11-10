package com.sena.controllabs.dto;

public record EquipmentResponse(
    Long id,
    String placa_sena,
    String codigo_activo,
    String tipo,
    Integer room_id,
    String estado
) {}
