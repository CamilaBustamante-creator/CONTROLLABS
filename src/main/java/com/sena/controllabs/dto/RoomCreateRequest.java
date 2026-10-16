package com.sena.controllabs.dto;

public record RoomCreateRequest(
    //@NotBlank(message = "El código del aula es obligatorio")
    String code,

    //@NotBlank(message = "El nombre del laboratorio no puede estar vacío")
    String name,

    //@NotNull(message = "Debe especificar la cantidad de PCs")
    //@Min(value = 1, message = "El laboratorio debe tener al menos 1 PC")
    Integer totalPcs,

    //@NotBlank(message = "El bloque de ubicación es obligatorio")
    String locationBlock
) {

}
