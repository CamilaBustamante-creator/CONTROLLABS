package com.sena.controllabs.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "equipment")
@Getter @Setter
@AllArgsConstructor
public class EquipmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "placa_sena", nullable = false, unique = true, length = 50)
    private String placaSena;

    @Column(name = "codigo_activo", nullable = false, unique = true, length = 100)
    private String codigoActivo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private EquipmentType tipo;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false)
    private RoomEntity room;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private EquipmentStatus estado = EquipmentStatus.OPERATIVO;

    public enum EquipmentType {
        COMPUTADOR, MOUSE, TECLADO, CARGADOR, TELEVISOR, CONTROL_TV
    }

    public enum EquipmentStatus {
        OPERATIVO, MANTENIMIENTO, FUERA_DE_SERVICIO
    }
}