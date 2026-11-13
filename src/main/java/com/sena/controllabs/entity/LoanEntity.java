package com.sena.controllabs.entity;

import java.time.OffsetDateTime;

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
@Table(name = "loans")
@Getter @Setter
@AllArgsConstructor
public class LoanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY) //LAZY O EAGER, EAGER: PARA GRAN VOLUMEN DE DATOS
    @JoinColumn(name = "room_id", nullable = false)
    private RoomEntity room;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id", nullable = false)
    private UserEntity instructor;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "guarda_id", nullable = false)
    private UserEntity guarda;

    @Column(name = "numero_pc", nullable = false)
    private Integer numeroPc;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 24)
    private LoanStatus estado = LoanStatus.PENDIENTE_APROBACION;

    @Column(name = "created_at", nullable = false, updatable = false)
    private OffsetDateTime createdAt = OffsetDateTime.now();

    @Column(name = "accepted_at")
    private OffsetDateTime acceptedAt;

    public enum LoanStatus {
        PENDIENTE_APROBACION, APROBADO_Y_FIRMADO
    }
}