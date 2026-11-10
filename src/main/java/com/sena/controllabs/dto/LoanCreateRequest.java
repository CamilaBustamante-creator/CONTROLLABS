package com.sena.controllabs.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record LoanCreateRequest(

        @NotNull(message = "Debe especificar el numero de PCs")
        @Min(value = 1, message = "El laboratorio debe tener al menos 1 PC")
        Integer numero_pc
) {}
